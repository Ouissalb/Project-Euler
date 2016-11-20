#include <stdio.h>
#include <string.h>
    void main()
    {
        char sentence[200];
        int i;
        int vowels = 0;
        printf("Enter a sentence \n");
        gets(sentence);
        for (i = 0; sentence[i] != '\0'; i++)
        {
            if ((sentence[i] == 'a' || sentence[i] == 'e' || sentence[i] ==
            'i' || sentence[i] == 'o' || sentence[i] == 'u') ||
            (sentence[i] == 'A' || sentence[i] == 'E' || sentence[i] ==
            'I' || sentence[i] == 'O' || sentence[i] == 'U'))
            {
                vowels = vowels + 1;
            }
        }
        printf("There are %d vowels in the given sentence\n",vowels);
    }
