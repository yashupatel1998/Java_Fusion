public class Sorting {
        private static int partition(int[] arry, int low, int high) {
            int pivot = arry[high];
            int i = low - 1;
            for (int j = 0; j < high; j++) {
                if (arry[j] < pivot) {
                    i++;
                    int temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }

            }
            i++;
            int temp = arry[i];
            arry[i] = arry[high];
            arry[high] = temp;
            return i;
        }
        private static void quickShort(int[] arry, int low, int high) {
            if(low<high){
                int pi = partition(arry, low, high);
                quickShort(arry, low, pi-1);
                quickShort(arry, pi+1, high);
            }
        }
        public static void main(String[] args){
            int [] arry = {6,3,2,5,8,9};
            int n = arry.length;
            quickShort(arry, 0, n-1);

            for (int j : arry) {
                System.out.println(j + " ");
            }
            System.out.println();
        }

    }


