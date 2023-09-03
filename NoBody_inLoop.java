// Here is the code related to the while loop
// #Java Basic Code Command
// Mayank Singh 
// Connect with me you using Github @makii0223, Discord @makii0223

public class NoBody_inLoop {
public static void main(String args[])
{
    int i,j;
    i=100;
    j=200;

    //Find the mindpoint between i and j 
    while(++i < --j);
    // here ther is no body in this loop conditon as their is the semicolon on the end of the loop bracket that why we end the loop
    
    System.out.println("Midpoint is " +i);
}  
}

//the body of the while can be empty this is because a null statement is systactically valid in Java
