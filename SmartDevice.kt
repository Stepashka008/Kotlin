// Создайте абстрактный класс SmartDevice, от которого будут
// наследоваться LightTwo и ThermostatTwo. // Шаг 8 задача 2
abstract class SmartDevice() {

    protected var name: String = "";
    protected var status: Boolean = false;
    protected var color: String = "";

    constructor(name: String, status: Boolean, color: String) : this(){
        this.name = name;
        this.status = status;
        this.color = color;
    }

    abstract fun receiveName(): String
    abstract fun receiveStatus(): Boolean
    abstract fun receiveColor(): String
    abstract fun changeName(name: String)
    abstract fun changeStatus(status: Boolean)
    abstract fun changeColor(color: String)
    abstract fun toStr(): String;
}