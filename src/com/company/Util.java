package com.company;

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
}
