// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 12 (Wednesday), 2021




/* 
    Program: Demonstrate with an example that what is the maximum number of arguments of similar type we can pass into a method in Java
*/
class TC_018_MaxNoOfParamsSimilar
{
    public void method1(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, int a12, int a13, int a14, int a15, int a16, int a17, int a18, int a19, int a20, int a21, int a22, int a23, int a24, int a25, int a26, int a27, int a28, int a29, int a30, int a31, int a32, int a33, int a34, int a35, int a36, int a37, int a38, int a39, int a40, int a41, int a42, int a43, int a44, int a45, int a46, int a47, int a48, int a49, int a50, int a51, int a52, int a53, int a54, int a55, int a56, int a57, int a58, int a59, int a60, int a61, int a62, int a63, int a64, int a65, int a66, int a67, int a68, int a69, int a70, int a71, int a72, int a73, int a74, int a75, int a76, int a77, int a78, int a79, int a80, int a81, int a82, int a83, int a84, int a85, int a86, int a87, int a88, int a89, int a90, int a91, int a92, int a93, int a94, int a95, int a96, int a97, int a98, int a99, int a100, int a101, int a102, int a103, int a104, int a105, int a106, int a107, int a108, int a109, int a110, int a111, int a112, int a113, int a114, int a115, int a116, int a117, int a118, int a119, int a120, int a121, int a122, int a123, int a124, int a125, int a126, int a127, int a128, int a129, int a130, int a131, int a132, int a133, int a134, int a135, int a136, int a137, int a138, int a139, int a140, int a141, int a142, int a143, int a144, int a145, int a146, int a147, int a148, int a149, int a150, int a151, int a152, int a153, int a154, int a155, int a156, int a157, int a158, int a159, int a160, int a161, int a162, int a163, int a164, int a165, int a166, int a167, int a168, int a169, int a170, int a171, int a172, int a173, int a174, int a175, int a176, int a177, int a178, int a179, int a180, int a181, int a182, int a183, int a184, int a185, int a186, int a187, int a188, int a189, int a190, int a191, int a192, int a193, int a194, int a195, int a196, int a197, int a198, int a199, int a200, int a201, int a202, int a203, int a204, int a205, int a206, int a207, int a208, int a209, int a210, int a211, int a212, int a213, int a214, int a215, int a216, int a217, int a218, int a219, int a220, int a221, int a222, int a223, int a224, int a225, int a226, int a227, int a228, int a229, int a230, int a231, int a232, int a233, int a234, int a235, int a236, int a237, int a238, int a239, int a240, int a241, int a242, int a243, int a244, int a245, int a246, int a247, int a248, int a249, int a250, int a251, int a252, int a253, int a254)
    {
        System.out.println("--- Invocation of method1() is successful ---");
    }

    public static void method2(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, int a12, int a13, int a14, int a15, int a16, int a17, int a18, int a19, int a20, int a21, int a22, int a23, int a24, int a25, int a26, int a27, int a28, int a29, int a30, int a31, int a32, int a33, int a34, int a35, int a36, int a37, int a38, int a39, int a40, int a41, int a42, int a43, int a44, int a45, int a46, int a47, int a48, int a49, int a50, int a51, int a52, int a53, int a54, int a55, int a56, int a57, int a58, int a59, int a60, int a61, int a62, int a63, int a64, int a65, int a66, int a67, int a68, int a69, int a70, int a71, int a72, int a73, int a74, int a75, int a76, int a77, int a78, int a79, int a80, int a81, int a82, int a83, int a84, int a85, int a86, int a87, int a88, int a89, int a90, int a91, int a92, int a93, int a94, int a95, int a96, int a97, int a98, int a99, int a100, int a101, int a102, int a103, int a104, int a105, int a106, int a107, int a108, int a109, int a110, int a111, int a112, int a113, int a114, int a115, int a116, int a117, int a118, int a119, int a120, int a121, int a122, int a123, int a124, int a125, int a126, int a127, int a128, int a129, int a130, int a131, int a132, int a133, int a134, int a135, int a136, int a137, int a138, int a139, int a140, int a141, int a142, int a143, int a144, int a145, int a146, int a147, int a148, int a149, int a150, int a151, int a152, int a153, int a154, int a155, int a156, int a157, int a158, int a159, int a160, int a161, int a162, int a163, int a164, int a165, int a166, int a167, int a168, int a169, int a170, int a171, int a172, int a173, int a174, int a175, int a176, int a177, int a178, int a179, int a180, int a181, int a182, int a183, int a184, int a185, int a186, int a187, int a188, int a189, int a190, int a191, int a192, int a193, int a194, int a195, int a196, int a197, int a198, int a199, int a200, int a201, int a202, int a203, int a204, int a205, int a206, int a207, int a208, int a209, int a210, int a211, int a212, int a213, int a214, int a215, int a216, int a217, int a218, int a219, int a220, int a221, int a222, int a223, int a224, int a225, int a226, int a227, int a228, int a229, int a230, int a231, int a232, int a233, int a234, int a235, int a236, int a237, int a238, int a239, int a240, int a241, int a242, int a243, int a244, int a245, int a246, int a247, int a248, int a249, int a250, int a251, int a252, int a253, int a254, int a255)
    {
        System.out.println("--- Invocation of method2() is successful ---");
    }

    public static void method3(Object a1, Object a2, Object a3, Object a4, Object a5, Object a6, Object a7, Object a8, Object a9, Object a10, Object a11, Object a12, Object a13, Object a14, Object a15, Object a16, Object a17, Object a18, Object a19, Object a20, Object a21, Object a22, Object a23, Object a24, Object a25, Object a26, Object a27, Object a28, Object a29, Object a30, Object a31, Object a32, Object a33, Object a34, Object a35, Object a36, Object a37, Object a38, Object a39, Object a40, Object a41, Object a42, Object a43, Object a44, Object a45, Object a46, Object a47, Object a48, Object a49, Object a50, Object a51, Object a52, Object a53, Object a54, Object a55, Object a56, Object a57, Object a58, Object a59, Object a60, Object a61, Object a62, Object a63, Object a64, Object a65, Object a66, Object a67, Object a68, Object a69, Object a70, Object a71, Object a72, Object a73, Object a74, Object a75, Object a76, Object a77, Object a78, Object a79, Object a80, Object a81, Object a82, Object a83, Object a84, Object a85, Object a86, Object a87, Object a88, Object a89, Object a90, Object a91, Object a92, Object a93, Object a94, Object a95, Object a96, Object a97, Object a98, Object a99, Object a100, Object a101, Object a102, Object a103, Object a104, Object a105, Object a106, Object a107, Object a108, Object a109, Object a110, Object a111, Object a112, Object a113, Object a114, Object a115, Object a116, Object a117, Object a118, Object a119, Object a120, Object a121, Object a122, Object a123, Object a124, Object a125, Object a126, Object a127, Object a128, Object a129, Object a130, Object a131, Object a132, Object a133, Object a134, Object a135, Object a136, Object a137, Object a138, Object a139, Object a140, Object a141, Object a142, Object a143, Object a144, Object a145, Object a146, Object a147, Object a148, Object a149, Object a150, Object a151, Object a152, Object a153, Object a154, Object a155, Object a156, Object a157, Object a158, Object a159, Object a160, Object a161, Object a162, Object a163, Object a164, Object a165, Object a166, Object a167, Object a168, Object a169, Object a170, Object a171, Object a172, Object a173, Object a174, Object a175, Object a176, Object a177, Object a178, Object a179, Object a180, Object a181, Object a182, Object a183, Object a184, Object a185, Object a186, Object a187, Object a188, Object a189, Object a190, Object a191, Object a192, Object a193, Object a194, Object a195, Object a196, Object a197, Object a198, Object a199, Object a200, Object a201, Object a202, Object a203, Object a204, Object a205, Object a206, Object a207, Object a208, Object a209, Object a210, Object a211, Object a212, Object a213, Object a214, Object a215, Object a216, Object a217, Object a218, Object a219, Object a220, Object a221, Object a222, Object a223, Object a224, Object a225, Object a226, Object a227, Object a228, Object a229, Object a230, Object a231, Object a232, Object a233, Object a234, Object a235, Object a236, Object a237, Object a238, Object a239, Object a240, Object a241, Object a242, Object a243, Object a244, Object a245, Object a246, Object a247, Object a248, Object a249, Object a250, Object a251, Object a252, Object a253, Object a254, Object a255)
    {
        System.out.println("--- Invocation of method3() is successful ---");
    }

    public void method4(double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13, double a14, double a15, double a16, double a17, double a18, double a19, double a20, double a21, double a22, double a23, double a24, double a25, double a26, double a27, double a28, double a29, double a30, double a31, double a32, double a33, double a34, double a35, double a36, double a37, double a38, double a39, double a40, double a41, double a42, double a43, double a44, double a45, double a46, double a47, double a48, double a49, double a50, double a51, double a52, double a53, double a54, double a55, double a56, double a57, double a58, double a59, double a60, double a61, double a62, double a63, double a64, double a65, double a66, double a67, double a68, double a69, double a70, double a71, double a72, double a73, double a74, double a75, double a76, double a77, double a78, double a79, double a80, double a81, double a82, double a83, double a84, double a85, double a86, double a87, double a88, double a89, double a90, double a91, double a92, double a93, double a94, double a95, double a96, double a97, double a98, double a99, double a100, double a101, double a102, double a103, double a104, double a105, double a106, double a107, double a108, double a109, double a110, double a111, double a112, double a113, double a114, double a115, double a116, double a117, double a118, double a119, double a120, double a121, double a122, double a123, double a124, double a125, double a126, double a127)
    {
        System.out.println("--- Invocation of method4() is successful ---");
    }

    public static void method5(double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13, double a14, double a15, double a16, double a17, double a18, double a19, double a20, double a21, double a22, double a23, double a24, double a25, double a26, double a27, double a28, double a29, double a30, double a31, double a32, double a33, double a34, double a35, double a36, double a37, double a38, double a39, double a40, double a41, double a42, double a43, double a44, double a45, double a46, double a47, double a48, double a49, double a50, double a51, double a52, double a53, double a54, double a55, double a56, double a57, double a58, double a59, double a60, double a61, double a62, double a63, double a64, double a65, double a66, double a67, double a68, double a69, double a70, double a71, double a72, double a73, double a74, double a75, double a76, double a77, double a78, double a79, double a80, double a81, double a82, double a83, double a84, double a85, double a86, double a87, double a88, double a89, double a90, double a91, double a92, double a93, double a94, double a95, double a96, double a97, double a98, double a99, double a100, double a101, double a102, double a103, double a104, double a105, double a106, double a107, double a108, double a109, double a110, double a111, double a112, double a113, double a114, double a115, double a116, double a117, double a118, double a119, double a120, double a121, double a122, double a123, double a124, double a125, double a126, double a127)
    {
        System.out.println("--- Invocation of method5() is successful ---");
    }
    
    public static void main(String[] args)
    {
        // byte, short, char, int, float and class / object type takes 254 parameters for non-static methods
        // byte, short, char, int, float and class / object type takes 255 parameters for static methods
        // float and double types take 127 parameters for both non-static and static methods
        TC_018_MaxNoOfParamsSimilar mnp = new TC_018_MaxNoOfParamsSimilar();
        mnp.method1(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254);

        TC_018_MaxNoOfParamsSimilar.method2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255);

        TC_018_MaxNoOfParamsSimilar.method3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

        mnp.method4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127);

        TC_018_MaxNoOfParamsSimilar.method5(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127);

    }
}
