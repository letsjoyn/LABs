//Write a C program for LPC2148 to generate a square wave using Timer0 in interrupt mode and observe the waveform in Keil uVision simulator.
#include <LPC214x.h>

void T0isr(void) __irq
{
    IO0PIN = ~IO0PIN;   // Toggle Port0

    T0IR = 1;           // Clear interrupt flag
    VICVectAddr = 0;    // End interrupt
}

int main()
{
    IODIR0 = 0xFFFFFFFF;   // Port0 output

    T0MR0 = 50000;         // Match value
    T0MCR = 3;             // Interrupt + reset

    VICVectAddr0 = (unsigned)T0isr;
    VICVectCntl0 = 0x24;

    VICIntEnable = 0x10;   // Enable Timer0 interrupt

    T0TCR = 1;             // Start timer

    while(1);
}
