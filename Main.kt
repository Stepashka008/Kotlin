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
}
