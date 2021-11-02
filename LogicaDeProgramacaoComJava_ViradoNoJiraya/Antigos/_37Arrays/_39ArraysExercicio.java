package br.com.LogicaProgramacao._37Arrays;

public class _39ArraysExercicio {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5};
        int[] v2 = {2,4,6,8,10};
        int[] vr = new int[5];
        for (int i = 0; i < vr.length ; i++) {
            vr[i] = v1[i] * v2[i];
            System.out.println(vr[i]);
        }
    }
}
