fun main() {
    val device = Device("Утюг", true, "Белый"); // Создание объекта
    println("Name: " + device.getName());
    println("Status: " + device.getStatus());
    println("Color: " + device.getColor() + "\n");

    val light: Light = Light("Лампа", false, "Темный", 50);
    println("Name: " + light.getName());
    println("Status: " + light.getStatus());
    println("Color: " + light.getColor() + "\n");

    val thermostat: Thermostat = Thermostat("Градусник", true, "Синий", 25);

    println(device.toString()) // Вывод полной информации об устройстве
    println(light.toString());
    println(thermostat.toString() + "\n");

    println(device.checkStatus()); // Проверка статуса устройства
    println(light.checkStatus());
    println(thermostat.checkStatus());
}