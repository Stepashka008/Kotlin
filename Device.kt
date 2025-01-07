// Объявление полей (конструктор) (val - не изменяется, var - изменяется)
open class Device() {
    private var name = "";
    private var status = false;
    private var color = "";
    // Реализуем встроенные конструкторы для классов Шаг 8 задача 3
    constructor(name: String, status: Boolean, color: String) : this(){
        this.name = name;
        this.status = status;
        this.color = color;
    }
    // Реализуем Геттеры и Сеттеры
    var Name: String // Свойство
        set(value) {
            var checking = true;
            val noNeedSymbols = "!@#$%^&*()_+=-{}[]0987654321"
            loop@for (symbol in value){
                for (noSymbol in noNeedSymbols){
                    if (symbol == noSymbol){
                        checking = false;
                        break@loop;
                    }
                }
            }
            if (checking){
                name = value;
            }
            else{
                println("Недопустимый символ в имени");
            }
        }
        get() = name;

    var Status: Boolean // Свойство
        set(value){
            status = value;
        }
        get() = status;

    var Color: String // Свойство
        set(value){
            color = value;
        }
        get() = color;

    // Реализуем методы
    override fun toString(): String{ // Получение полного описания объекта // Переопределенный метод
        return "Имя: $name, Статус: $status, Цвет: $color";
    }
    // Добавляем дополнительный метод для переопределения функционала классов при их наследовании // Шаг 8 задача 5
    open fun checkStatus(): String{
        if (status) return "$name: включен";
        return "$name: выключен";
    }
}