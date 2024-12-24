fun main() {
    val smartHome: SmartHome = SmartHome();
    smartHome.addDevice("Плита", false, "Серый");
    smartHome.addLight("Настольная лампа", true, "Черный", 50);
    smartHome.addThermostat("Градусник", true, "Белый", 30);

    smartHome.toStringDevice("Плита");
    smartHome.changeStatus("Плита");
    smartHome.checkStatus("Плита");

    smartHome.changeBrightnessOrTemperature("Настольная лампа", 60);
    smartHome.changeBrightnessOrTemperature("Градусник", -15);
    smartHome.toStringDevice("Настольная лампа");
    smartHome.toStringDevice("Градусник");

    smartHome.uploadedDevices(true); // Включение всех устройств
    smartHome.uploadedDevices(false); // Выключение всех устройств
}