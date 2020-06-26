
/* Faça um programa pare receber o código, nome, números de horas
trabalhadas e valor da hora trabalhada de 20 funcionários. Esses dados
deverão ser informados na função principal.
Implemente funções auxiliares para:
- Imprimir os dados de cada funcionário;
- Calcular e imprimir o nome e o salário bruto dos funcionários;
- Calcular e imprimir o(s) funcionário(s) com salário mais
elevado.
- Calcular e imprimir o(s) funcionário(s) com salário acima da
média.  */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int calculo(int codigo[], char nomes[5][100], int horas[], int vhoras[])
{
    int i, salario[5], maiorS = 0, totalS = 0, media = 0;
    char* nomeMaiorSalario;

    system("cls");

    for (i = 0; i < 5; i++)
        printf("\n\nUSUARIO: %s \nCodigo: %i  \tHoras: %i \tVhoras: %i ", nomes[i], codigo[i] + i, horas[i] + i, vhoras[i] + i);

    for (i = 0; i < 5; i++)
    {
        salario[i] = (horas[i] + i) * (vhoras[i] + i);

        totalS += salario[i];

        printf("\n\nUSUARIO: %s \nSalarioBruto: %i", nomes[i], salario[i]);

        if (salario[i] > maiorS)
        {
            maiorS = salario[i];
            strcpy(nomeMaiorSalario, nomes[i]);
        }
    }

    printf("\n\nMaior Salario\n Usuario: %s Salario: %i", nomeMaiorSalario, maiorS);

    media = (totalS / 5);

    printf("\nSalariios Maiores que a Media:");

    for (i = 0; i < 5; i++)
    {
        if (salario[i] > media)
        {
            printf("\nFuncionario: %s Salario:%i ", nomes[i], salario[i]);
        }
    }
}

int main()
{
    int i, i2, codigo[5], horas[5], vhoras[5];

    char nomes[5][100];

    for (i = 0; i < 5; i++)
    {
        printf("\n\nUSUARIO %i \n", i);

        printf("CODIGO: ");
        scanf("%i", &codigo[i]);
        fflush(stdin);

        printf("Nome: ");
        scanf("%[^\n]s", &nomes[i]);
        fflush(stdin);

        printf("Horas Trabalhadas: ");
        scanf("%i", &horas[i]);

        printf("Valor das Horas: ");
        scanf("%i", &vhoras[i]);
    }

    calculo(codigo, nomes, horas, vhoras);
}
