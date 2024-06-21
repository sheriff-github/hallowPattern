class hollowPattern {
    public static void main(String[] args) {
        hollowSquare();
        heart();
        hallow_tri();
        pyramid();
        rev_py();
        diamond();
    }

    public static void hollowSquare() {
        int n = 10; // Size of the square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for the borders of the square
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
 System.err.println("\n");       
    }

    public static void heart() {
        for(int i=0; i<=5;i++){
            for (int j=0; j<=6; j++){
                if ((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void hallow_tri(){
        int n=5;
        for (int i=1; i<=n ; i++){
            for( int j=1; j<=n; j++){
                if (i==1 || i==j || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
System.err.println("\n");         
    }
    public static void pyramid() {
        for (int i=1 ; i<=4 ;i++){
            for (int j=1 ;j<=7; j++){
                if ((i==4) || (j-i==3) || (i+j==5)){ 
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void rev_py() {
        System.err.println("\n"); 

        for( int i=1; i<=4 ;i++){
            for (int j=1 ; j<=7; j++){
                if (i==1 || i==j || i+j==8){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond() {
        System.err.println("\n"); 

        for(int i=1; i<=7; i++){
            for ( int j=1; j<=7;j++){
                if (i+j==5 || i-j==3 || i+j==11 ||j-i==3)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




}
