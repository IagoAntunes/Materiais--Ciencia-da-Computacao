#include <stdio.h>
#include <stdlib.h>

struct item{

	int cod;

};

typedef struct item Item;

struct node{
	
	Item item;
	struct node *left;
	struct node *right;
};

typedef struct node Node;

Node *initialize(){  //iNICIANDO STRUCT

	return NULL;
}

Item itemCreate(int cod){ //Criando Struct
	Item item;
	item.cod = cod;
	return item;
}

Node *treeInsert(Node *root,Item x){ //Inserindo Numeros
	if(root == NULL){
		Node *aux = (Node*)malloc(sizeof(Node));
		aux->item = x;  
		aux->left = NULL;  
		aux->right=NULL;   
		return aux;   
	}
	else{
		if(x.cod > root->item.cod){  
			root->right = treeInsert(root->right,x);
		}else if(x.cod < root->item.cod){
			root->left = treeInsert(root->left,x);
		}
	}
	return root;
}

void treePrint(Node *root){ //Printando ARVORE
	if(root != NULL){
		printf("   %d   ",root->item.cod);
		treePrint(root->left);
		treePrint(root->right);
	}	
}

int treeAltura(Node *root) { //Calcula Altura
    int u, v;
    if (root == NULL) 
		return -1;
    u = treeAltura(root->left);
    v = treeAltura(root->right);
    if (u > v) 
		return u+1;
    else 
		return v+1;
}

int  main(){
	Node *root = initialize();
	root = treeInsert(root,itemCreate(15));           
	root = treeInsert(root,itemCreate(18));			
	root = treeInsert(root,itemCreate(7));		
	root = treeInsert(root,itemCreate(19));
	root = treeInsert(root,itemCreate(20));
	

	printf("\n Arvore Binaria >>> ");
	treePrint(root);

	printf("\n\n\nAltura = %i",treeAltura(root));
	
}