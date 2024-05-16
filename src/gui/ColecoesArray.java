package gui;

public class ColecoesArray {
 
    private int[] array;
    private int size;

    public ColecoesArray(int capacidade) {
        array = new int[capacidade];
        size = 0;
    }

    // Método para inserir um elemento no array
    public void inserir(int elemento) {
        if (size < array.length) {
            array[size] = elemento;
            size++;
        } else {
            System.out.println("Array está cheio. Não é possível adicionar mais elementos.");
        }
    }

    // Método para remover um elemento do array
    public void remover(int elemento) {
        int index = buscar(elemento);
        if (index >= 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = 0;
            size--;
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    // Método para buscar um elemento no array
    public int buscar(int elemento) {
        for (int i = 0; i < size; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }

    // Método para imprimir o array
    public void imprimir() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	ColecoesArray colecao = new ColecoesArray(10);

        // Inserção de elementos
        colecao.inserir(5);
        colecao.inserir(10);
        colecao.inserir(15);

        // Imprimir array
        System.out.print("Array após inserções: ");
        colecao.imprimir();

        // Remover elemento
        colecao.remover(10);

        // Imprimir array
        System.out.print("Array após remoção: ");
        colecao.imprimir();

        // Buscar elemento
        int index = colecao.buscar(15);
        if (index >= 0) {
            System.out.println("Elemento 15 encontrado na posição: " + index);
        } else {
            System.out.println("Elemento 15 não encontrado.");
        }
    }
}
