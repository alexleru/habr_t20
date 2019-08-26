public class habr_t20 {
    public static void main(String[] args) {
        Vector3D[] arrayVectors = Vector3D.arrayVectors(4);
        double len = arrayVectors[0].leнghtOfVector();
        double scalarProduct = arrayVectors[1].scalarProduct(arrayVectors[2]);
        Vector3D vector3D = arrayVectors[3].sum(arrayVectors[0]);

        System.out.println(arrayVectors[0].toString());
        System.out.println(arrayVectors[3].toString());
        System.out.println(vector3D.toString());
        System.out.println(len);
        System.out.println(scalarProduct);
    }
}
