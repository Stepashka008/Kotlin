// Создайте абстрактный класс SmartDevice, от которого будут
// наследоваться LightTwo и ThermostatTwo. // Шаг 8 задача 2
abstract class SmartDevice(var name: String, var status: Boolean, var color: String) {
    abstract fun receiveName(): String
    abstract fun receiveStatus(): Boolean
    abstract fun receiveColor(): String
    abstract fun changeName(name: String)
    abstract fun changeStatus(status: Boolean)
    abstract fun changeColor(color: String)
    abstract fun toStr(): String;
}