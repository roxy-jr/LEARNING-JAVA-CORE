public class commandLineArgument{
    public static void main( String args[])
    {
    for(int  i=0;i<args.length;i++){
        System.out.println(args[i]+" ");
    }
    }
} // here the main function in java hold a default array whic retun
  //a string . length property determines the length of passed array
  // u can take any name of array in place of args[].
  // for compilation use javac className.java
  // for run use java className (  also pass here the array you want separated by whitespace)
  // use cmd with installed java