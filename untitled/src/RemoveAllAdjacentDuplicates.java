public class RemoveAllAdjacentDuplicates {

    // https://www.youtube.com/watch?v=hXEEr5WekSQ&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=27&t=0s
    public String removeAdjcaentDuplicates(String s){

        char[] stack=new char[s.length()]; // we are creating s.lenghth space because in case there are no duplicates , we return whole string
        // make a stack keep pushing elements in stack and checke character by character if element in char array is already present on top of stack , that will be our duplicate char, remember top of stack , remove these duplicate
        int i=0; // pointer for stack

        for (int j = 0; j <s.length() ; j++) {
            char current_Char=s.charAt(j);
            if(i>0 && stack[i-1]==current_Char){ // stack[i-1] last element of the array
                i--; //here i-- because we need to check if previous element matches, with adjacent element that will come , in next iteration of loop, so we take pointer back
            }
            // first it will go to else block as initially i will be 0 so if condition if(i>0) will fail
            else {
                stack[i]=   current_Char;
                i++;
            }
        }
        return new String(stack,0,i);

    }
    public static void main(String[] args) {

        RemoveAllAdjacentDuplicates removeAllAdjacentDuplicates=new RemoveAllAdjacentDuplicates();
        String s="abbaaaacca";
        String s1="abbaca";
        String s2="abbaaaasca";
        String s3="alex";
        String s4="aaleex";



        System.out.println("Here-->"+removeAllAdjacentDuplicates.removeAdjcaentDuplicates(s)); // in this case blank as everthing will be removed, as all are duplicates
        System.out.println("Here-->"+removeAllAdjacentDuplicates.removeAdjcaentDuplicates(s1));
        System.out.println("Here-->"+removeAllAdjacentDuplicates.removeAdjcaentDuplicates(s2));
        System.out.println("Here-->"+removeAllAdjacentDuplicates.removeAdjcaentDuplicates(s3));
        System.out.println("Here-->"+removeAllAdjacentDuplicates.removeAdjcaentDuplicates(s4));

    }
}
