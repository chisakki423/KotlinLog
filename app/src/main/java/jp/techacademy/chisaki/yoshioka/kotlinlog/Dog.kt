package jp.techacademy.chisaki.yoshioka.kotlinlog

import android.util.Log

open class Dog:Animal,Movable{

    // 引数付きコンストラクタ　初期化のためのメソッド
    constructor(name:String,age:Int):super(name,age) {
        this.name = name
        this.age = age
    }

    //メソッド
    override fun say() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
    override fun move() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "は全力で走った．")
    }


}