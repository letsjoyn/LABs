//Write a C program for LPC2148 to toggle the lowest pin of Port0 with a delay between the two states. Observe the waveform using the Logic Analyzer in Keil uVision simulator.
#include <LPC214x.h>

void delay(int n);

int main()
{
    IODIR0 = 0x00000001;     // P0.0 as output

    while(1)
    {
        IOSET0 = 0x00000001; // P0.0 HIGH
        delay(500);

        IOCLR0 = 0x00000001; // P0.0 LOW
        delay(500);
    }
}

void delay(int n)
{
    int i;

    for(i=0; i<n; i++);
}
