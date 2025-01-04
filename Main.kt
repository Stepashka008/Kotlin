fun main() {
    val smartHome: SmartHome = SmartHome();
    smartHome.addDevice("Плита", false, "Серый");
    smartHome.addLight("Настольная лампа", true, "Черный", 50);
    smartHome.addThermostat("Градусник", true, "Белый", 30);

    smartHome.toStringDevice("Плита");
    smartHome.changeStatus("Плита");
    smartHome.checkStatus("Плита");

    println();

    smartHome.changeBrightnessOrTemperature("Настольная лампа", 60);
    smartHome.changeBrightnessOrTemperature("Градусник", -35);
    smartHome.toStringDevice("Настольная лампа");
    smartHome.toStringDevice("Градусник");

    println();

    smartHome.uploadedDevices(true); // Включение всех устройств
    smartHome.uploadedDevices(false); // Выключение всех устройств

    smartHome.uploadedDevicesOfIndex(true); // Включение всех устройств

    smartHome.checkingStatusDevices(*arrayOf("Плита", "Настольная лампа", "Градусник")); // Вывод состояния устройства в консоль

    println();
    smartHome.changeColorAllDevice("Зеленый", "Синий", "Красный");
    smartHome.toStringDevice("Плита");
    smartHome.toStringDevice("Настольная лампа");
    smartHome.toStringDevice("Градусник");

    println();
    // Абстрактные классы
    val lightTwo = LightTwo("Ночник", true, "Золотой", 50);
    println(lightTwo.toStr());

    val thermostatTwo = ThermostatTwo("Микроволновка", false, "Белый", 20);
    println(thermostatTwo.toStr());
}

