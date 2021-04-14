#include <stdio.h>
#include <stdlib.h>


bool pesquisaSequencial(int vetor[], int chave,int capacidade){
    int resp = false;
    int count = 0;
    for(int i=0; i<capacidade; i++){
        count++;
        if(vetor[i] == chave){
            resp = true;
            i = capacidade;
        }
    }
    return resp;
}

struct item{

	char cod;

};

typedef struct item Item;

struct node{
	
	Item item;
	struct node *left;
	struct node *right;
};

typedef struct node Node;


Node *initialize(){//INICIANDO STRUCT
	return NULL;
}

Item itemCreate(char cod){ //CRIANDO STRUCT
	Item item;
	item.cod = cod;
	return item;
}

Node *treeInsert(Node *root,Item x){ //INSERINDO PRODUTOS
	if(root == NULL){
		Node *aux = (Node*)malloc(sizeof(Node));
		aux->item = x;  
		aux->left = NULL;  
		aux->right=NULL;   
		return aux;   
	}
	else{
		//printf("\n X.COD = %i  ROOT.ITEM = %i\n",x.cod,root->item.cod);
		if(x.cod > root->item.cod){  
			root->right = treeInsert(root->right,x);
		}else if(x.cod < root->item.cod){
			root->left = treeInsert(root->left,x);
		}
	}
	return root;
}

void treePrint(Node *root){
	if(root != NULL){
		printf("   %d   ",root->item.cod);
		treePrint(root->left);
		treePrint(root->right);
	}	
}



int  main(){
	Node *root = initialize();
	int opcao = 0,count;
	char produto;
	
	while(opcao != 1){
		count ++;  
		printf("\nDeseja Continuar ?[1]");
		scanf("%i",&opcao);
		if(opcao == 1){
			break;
		}
		printf("\nAdicionar produto:");
		scanf("%s",&produto);
		root = treeInsert(root,itemCreate(produto)); 
	}
	
	
	int codigo2;

	int codigos[count];
	
	for(int i=0;i<count;i++){
		
		printf("Codigo");
		scanf("%i",&codigos[i]);
	};
	printf("Pesquisar codigo:");
	scanf("%i",&codigo2);

	if(pesquisaSequencial(codigos, codigo2,count) == true){
        printf("CODIGO ENCONTRADO\n");
    } else {
        printf("CODIGO NAO ENCONTRADO\n");
    }		
}