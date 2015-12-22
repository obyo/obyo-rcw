package com.company;

public class Main {
    public static void main(String[] args) {
        showRecipeTitle("オムライス");
    }

    /**
     * レシピのタイトルを出力する
     * タイトルが不正なら何もしない
     *
     * @param title 出力したいタイトル
     */
    private static void showRecipeTitle(String title) {
        if (Util.isEmpty(title)) {
            return;
        }
        System.out.println(title);
    }
}
