//Write a C program for LPC2148 to display the string “I LOVE ISE” in the UART0 serial window using Keil uVision simulator.
#include <LPC214x.h>

void init()
{
    PINSEL0 = 0x00000005;   // TXD0 and RXD0

    U0FCR = 0x07;           // Enable FIFO
    U0LCR = 0x83;           // 8-bit, DLAB = 1

    U0DLL = 0x61;           // 9600 baud rate
    U0DLM = 0x00;

    U0LCR = 0x03;           // DLAB = 0
}

void delay()
{
    int i;

    for(i=0; i<250; i++);
}

int main()
{
    unsigned char p[] = "I LOVE ISE\n";
    int z;

    init();

    for(z=0; p[z] != '\0'; z++)
    {
        U0THR = p[z];

        while(!(U0LSR & 0x20));

        delay();
    }

    while(1);
}
