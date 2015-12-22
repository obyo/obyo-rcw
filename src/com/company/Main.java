package com.company;

public class Main {
    public static void main(String[] args) {
        Recipe recipe = Util.loadRecipeFromFile("");
        if (recipe == null) {
            System.out.println("レシピが取得出来ませんでした");
            return;
        }
        showRecipeTitle(recipe.getTitle());
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
