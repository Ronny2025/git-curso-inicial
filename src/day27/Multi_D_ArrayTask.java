package day27;

public class Multi_D_ArrayTask {
    public static void main(String[] args) {
        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15} ,{100, 90,89,7888}};
        int max = numbers[0][0]; //assume that the first element is the max

        for (int i = 0; i < numbers.length; i++) {//checks each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) {//check each elements in the single dimension
                if (max < numbers[i][j]) {//compares index 0 of the aeeay with each index
                    max = numbers[i][j];//assign the maximum number


                }

            }

        }
        System.out.println(max);

        //solution2;  for each

        int max2 = numbers[0][0];
        for (int[]each1DArray :numbers ) {//variable each1DArray represents each singles dimensional array
            for(int eachInt: each1DArray){
                if(max2<eachInt){
                    max2=eachInt;
                }
            }

        }
        System.out.println(max2);

        //finding the minimun number:
        int min = numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(min>numbers[i][j]){

                }

            }

        }
        System.out.println(min);

        System.out.println("======================================");
        String[]developersTeam={"Vladsilav","Hasan","Tolkun","Abide"};
        String[]testerTeam={"Zhibehach","Mohammed","Sohrabi","Nursultan"};
        String[]businessAnalystTeam={"Lisa","Ershad","Naila"};

    }
}
