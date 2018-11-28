interface LambdaExpression1Interface {

    int abstractFun(int x);
}

class LambdaExpression1 {

    public static void main(String args[]) {
        LambdaExpression1Interface lambdaObj = (int aInt)->{return aInt;};

        int a =lambdaObj.abstractFun(42);
    }

}