
public class fithlabprob7 {
    // not sure if we were supposed to prompt user for an array or use our own, so i just made a set matrix 

        // sets limit of the function to check set double array matrix
        private static final int limit = 4; 
        
        // Function to see if current set array is upper triangular
        public static Boolean isUpperTriangularMatrix(int mat[][]){
            for (int i = 1; i < limit ; i++){
                for (int j = 0; j < i; j++){
                    if (mat[i][j] != 0){
                        return false; 
                    }    
                }
            }
            return true;     
        }  
            
    
        public static void main(String argc[]){ 
            int[][] mat= { { 2, 4, 5, 3 }, 
                            { 0, 6, 7, 2 }, 
                            { 0, 0, 2, 9 }, 
                            { 0, 0, 0, 6 } }; 
            if (isUpperTriangularMatrix(mat)) 
                System.out.println("This matrix is upper triangular!"); 
            else
                System.out.println("This matrix is not upper triangular!"); 
        } 
} 
