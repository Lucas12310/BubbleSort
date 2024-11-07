public class BubbleSort {
    // Alunos Lucas Fernandes da Silva e Vitor Gabriel da Silva Rocha
    // 4 Periodo de ADS, apresentação será realizada a parte teórico com o PDF e a Pratica com o VS code
    // Método principal que chama os outros métodos
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,6}; // Array a ser ordenado
        
        System.out.println("Array fora de ordem:");
        printArray(arr);

        System.out.println();
        
        bubbleSort(arr); // Chamando o método Bubble Sort
        
        System.out.println("\nArray Ordenado:");
        printArray(arr); // Imprimindo o array ordenado
    }
    
    // Método para ordenar o array usando o Bubble Sort
    public static void bubbleSort(int[] array) {
        int TamanhoArray = array.length; // recebendo o tamanho do array
        
        // Passando por todos os elementos do array
        for (int i = 0; i < TamanhoArray - 1; i++) {
            boolean HouveTroca = false; // Variável para verificar se houve troca
            
            // Últimos i elementos já estão na posição correta, 
            //decrementando para não consultar o ultimo elemento ja ordenado
            for (int j = 0; j < TamanhoArray - 1 - i; j++) {
                // Se o elemento atual for maior que o próximo, troque-os
                if (array[j] > array[j + 1]) {
                    // Troca de posição
                    trocar(array, j, j + 1);
                    HouveTroca = true; // Indicando que houve troca
                }
            }
            
            // Se nenhum elemento foi trocado, o array já está ordenado
            if (!HouveTroca) {
                break;
            }
        }
    }

    // Método para trocar dois elementos de lugar
    public static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        printArray(array);
    }

    // Método para imprimir o conteúdo do array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Quebra de linha após a impressão do array
    }
}