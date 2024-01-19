import java.util.List;

// Hava Yolu Şirketi sınıfı
class Airline {
    String airlineId;
    List<Aircraft> aircraftList;
    List<Pilot> pilots;

    // Diğer özellikler ve metotlar
}

// Uçak sınıfı
class Aircraft {
    String aircraftId;
    boolean isOperational;
    AircraftType aircraftType;

    // Diğer özellikler ve metotlar
}

// Uçak Tipi sınıfı
class AircraftType {
    String typeName;
    int requiredPilots;

    // Diğer özellikler ve metotlar
}

// Uçuş sınıfı
class Flight {
    String flightId;
    Airport departureAirport;
    Airport arrivalAirport;
    String departureTime;
    String arrivalTime;
    Pilot pilot;
    CoPilot coPilot;

    // Diğer özellikler ve metotlar
}

// Havaalanı sınıfı
class Airport {
    String airportId;
    String airportName;

    // Diğer özellikler ve metotlar
}

// Pilot sınıfı
class Pilot {
    String pilotId;
    String name;
    int experienceLevel;

    // Diğer özellikler ve metotlar
}

// Yardımcı Pilot (CoPilot) sınıfı
class CoPilot {
    String coPilotId;
    String name;
    int experienceLevel;

    // Diğer özellikler ve metotlar
}
