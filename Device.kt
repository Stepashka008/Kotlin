// Объявление полей (конструктор) (val - не изменяется, var - изменяется)
open class Device (private val name: String, private var status: Boolean, private var color: String) {

    fun getName(): String{ // Метод возвращающий имя
        return name;
    }
    fun getStatus(): Boolean{ // Метод возвращающий статус
        return status;
    }
    fun setStatus(status: Boolean) {
        this.status = status;
    }
    fun getColor(): String{ // Метод возвращающий цвет
        return color;
    }
    fun setColor(color: String) {
        this.color = color;
    }
    override fun toString(): String{ // Получение полного описания объекта // Переопределенный метод
        return "Имя: $name, Статус: $status, Цвет: $color";
    }
    open fun checkStatus(): String{
        if (status) return "$name: включен";
        return "$name: выключен";
    }
}