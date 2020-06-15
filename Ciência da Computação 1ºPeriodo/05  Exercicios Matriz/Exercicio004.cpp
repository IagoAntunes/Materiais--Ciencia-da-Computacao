
/* Você deverá simular um bolão de loteria, onde irão participar 10 jogadores. Receba do
usuário 6 números entre 1 e 20 para cada jogador. Depois sorteie 6 números aleatórios, também
entre 1 e 20. Ao final dizer qual jogador fez mais pontos. Dica: deixa uma coluna da matriz para
armazenar quantos números o usuário acertou.  */

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int matriz[10][7], i, j, sorteados[6], maior = 0, maiorPosi, pontos[10], k;

    for(i=0; i<10; i++)
    {
        printf("\tJogador %dº:\n", i+1);
        for(j=0; j<6; j++)
        {
            do
            {
                printf("informe %dº o numero: ", j+1);
                scanf("%d", &matriz[i][j]);
            }
            while(matriz[i][j] > 20 || [i][j] < 0);
        }
        printf("\n");
    }

    printf("Valores sorteados: ");
    for(i=0; i<6; i++) 
    {
        sorteados[i] = rand()%20;
        printf(" %d ", sorteados[i]);
    }
    printf("\n");

    for(i=0; i<10; i++)
    {
        pontos[i] = 0;
        for(j=0; j<6; j++)
        {
            for(k=0; k<6; k++)
            {
                if(matriz[i][j] == sorteados[k]) pontos[i]++;
            }
        }
        if(pontos[i] > maior)
        {
            maior = pontos[i];
            maiorPosi = i+1;
        }
    }

    for(i=0; i<10; i++)
    {
        printf("Jogador %d: \n", i+1);
        for(j=0; j<6; j++)
        {
            printf(" %d ", matriz[i][j]);
        }
        printf("Pontos: %d",pontos[i]);
        printf("\n");
    }

    printf("\nO vencedor foi o %d jogador com %d pontos", maiorPosi, maior);

    printf("\n\n");
    system("pause");
    return 0;
}
