package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 便利クラス
 * Created by obatay on 2015/12/22.
 */
public final class Util {

    private Util() {

    }

    /**
     * 引数に入れた文字列が空もしくはnullかどうか判別する
     *
     * @param str 判定対象の文字列
     * @return 空ならtrue
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * ローカルのjsonファイルをレシピ形式に変換する
     *
     * @param filePath ファイルがあるパス
     * @return {@link Recipe}
     */
    public static Recipe loadRecipeFromFile(String filePath) {
        if (isEmpty(filePath)) {
            return null;
        }
        Gson gson = new Gson();
        JsonReader reader = null;
        Recipe recipe = null;
        try {
            reader = new JsonReader(new FileReader(filePath));
            recipe = gson.fromJson(reader, Recipe.class);
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return recipe;
    }
}
