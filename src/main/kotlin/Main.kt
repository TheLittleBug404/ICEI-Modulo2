package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //objeto es cuando nosotros convocamos o llamanos a una clase o instaciamos
    //esto es un objeto
    var telefono: Celular = Celular("Samsung", "S25","Negro");
    var telefono1: Celular = Celular("Samsung", "S24","Blanco");
    var telefono2: Celular = Celular("Sony", "Z25","Blanco");
    var telefono3: Celular = Celular("Huawei", "GTX","Fuxia");

    println(telefono.modelo)
    telefono.llamar()
    println(telefono1.marca)
    println(telefono2.marca)
    println(telefono3.marca)
}
//esto es una clase
class Celular {
    //atributos
    var marca:String
    var modelo:String
    var color:String

    //constructor son los datos iniciales de nuestra clase
    constructor(marca:String, modelo:String, color:String){
        this.marca = marca
        this.modelo = modelo
        this.color = color
    }
    //metodos
    fun llamar(){
        println("LLamar");
    }
}