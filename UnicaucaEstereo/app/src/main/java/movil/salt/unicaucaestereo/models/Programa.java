package movil.salt.unicaucaestereo.models;

import java.util.ArrayList;

/**
 * Created by pc on 27/05/2015.
 */
public class Programa {
    String name;
    int startTime;
    int startMin;
    int endMin;
    int endTime;
    String description;
    String announcer;
    String director;
    String day;
    String typep;

    public Programa(String name, int startTime, int startMin, int endMin, int endTime, String description, String announcer, String director, String day, String typep) {
        this.name = name;
        this.startTime = startTime;
        this.startMin = startMin;
        this.endMin = endMin;
        this.endTime = endTime;
        this.description = description;
        this.announcer = announcer;
        this.director = director;
        this.day = day;
        this.typep = typep;
    }

    public Programa() {

    }

    public ArrayList<Programa>  getProgramas()
    {
        ArrayList<Programa> programas = new ArrayList<>();
        //region Lunes
        Programa p1 = new Programa( name = "Musicalidades", startTime = 0, startMin = 0, endMin = 0, endTime = 1, description = "Música para todos los gustos, para recordar y disfrutar.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Repetición");
        programas.add(p1);
        Programa p2 = new Programa( name = "Conexión Jazz", startTime = 1, startMin = 0, endMin = 0, endTime = 2, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Monday", typep = "Repetición");
        programas.add(p2);
        Programa p3 = new Programa ( name = "Música Clásica", startTime = 2, startMin = 0, endMin = 0, endTime = 3, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Monday", typep = "Repetición" );
        programas.add(p3);
        Programa p4 = new Programa ( name = "Cancionero", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Repetición" );
        programas.add(p4);
        Programa p5 = new Programa ( name = "Baladas con Amor", startTime = 4, startMin = 0, endMin = 0, endTime = 5, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Repetición" );
        programas.add(p5);
        Programa p6 = new Programa ( name = "Boleros", startTime = 5, startMin = 0, endMin = 0, endTime = 6, description = "El bolero es eterno... Música para enamorar y disfrutar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Monday", typep = "Nuevo" );
        programas.add(p6);
        Programa p7 = new Programa ( name = "Nuestra Música Colombiana", startTime = 6, startMin = 0, endMin = 0, endTime = 7, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Nuevo" );
        programas.add(p7);
        Programa p8 = new Programa ( name = "La Franja", startTime = 7, startMin = 0, endMin = 0, endTime = 8, description = "Su formato corresponde a un programa dedicado a temas o acontecimientos universitarios de carácter informativo que en su estructura utilizan recursos mixtos propios de un magazín. La estructura de la Franja está constituida por secciones, cada una de las cuales con un objetivo claramente definido buscando aprovechar al máximo los recursos que se generan a nivel informativo y educativo en la universidad.", announcer = "Flordelis Urrea", director = "Flordelis Urrea", day = "Monday", typep = "Nuevo" );
        programas.add(p8);
        Programa p9 = new Programa ( name = "Ciudad Feliz", startTime = 8, startMin = 0, endMin = 0, endTime = 9, description = "Programa que presenta historias de vida, reflexiones, y temas de salud. Acompañado de  música con mensajes para la vida y la sociedad.", announcer = "", director = "", day = "Monday", typep = "Nuevo" );
        programas.add(p9);
        Programa p10 = new Programa ( name = "Saberes", startTime = 9, startMin = 0, endMin = 30, endTime = 9, description = "El programa radial de la Vicerrectoría de Investigaciones de la Universidad del Cauca, llevando la ciencia, la tecnología, el emprendimiento y la innovación a tu oído. Porque conocer lo que hacen nuestros investigadores y su impacto social, es un compromiso institucional.", announcer = "María Alejandra Medina", director = "María Alejandra Medina", day = "Monday", typep = "Nuevo" );
        programas.add(p10);
        Programa p11 = new Programa ( name = "Amor a la Salud", startTime = 9, endMin = 0, startMin = 30, endTime = 10, description = "El programa Amor a la Salud es una iniciativa de promoción de la cultura del cuidado a partir de la actividad física y los hábitos saludables liderado por el programa de fisioterapia, tenemos varios focos de intervención uno de los cuales es los medios de comunicación universitarios, específicamente radio y televisión de Unicauca.", announcer = "", director = "", day = "Monday", typep = "Repetición" );
        programas.add(p11);
        Programa p12 = new Programa ( name = "Conexión Jazz", startTime = 10, startMin = 0, endMin = 0, endTime = 11, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Monday", typep = "Nuevo" );
        programas.add(p12);
        Programa p13 = new Programa ( name = "Baladas con Amor", startTime = 11, startMin = 0, endMin = 0, endTime = 12, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Nuevo" );
        programas.add(p13);
        Programa p14 = new Programa ( name = "Musicalidades", startTime = 12, startMin = 0, endMin = 0, endTime = 13, description = "Música para todos los gustos, para recordar y disfrutar.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Nuevo" );
        programas.add(p14);
        Programa p15 = new Programa ( name = "Música Clásica", startTime = 13, startMin = 0, endMin = 0, endTime = 14, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Monday", typep = "Nuevo" );
        programas.add(p15);
        Programa p16 = new Programa ( name = "Me Gusta", startTime = 14, startMin = 0, endMin = 0, endTime = 16, description = "Programa joven y alternativo de la radio, con lo mejor del rock, pop, reggae y ska, ME GUSTA 104.1 FM", announcer = "María Alejandra Medina", director = "María Alejandra Medina", day = "Monday", typep = "Nuevo" );
        programas.add(p16);
        Programa p17 = new Programa ( name = "Pasaporte Express Internacional", startTime = 16, startMin = 0, endMin = 0, endTime = 18, description = "Para viajar a través del tiempo, la música adulto contenporánea, los 70, 80 y 90 SOLO ÉXITOS - RETRO MUSIC", announcer = "Jorge Gonzáles", director = "Jorge Gonzáles", day = "Monday", typep = "Nuevo" );
        programas.add(p17);
        Programa p18 = new Programa ( name = "Factor RH", startTime = 18, startMin = 0, endMin = 0, endTime = 19, description = "Sólo para los que tienen espíritu joven, sin importar su edad y para quienes viven el Rock. Nació hace más de diez y seis años esta producción radiofónica, reflejando lo que son y aquello que viven los rockeros, FACTOR RH y su grupo de melómanos realizadores se encargan de presentar todo lo que tiene que ver con el mundo del ROCK, música, artistas, historia, estilos.", announcer = "Javier Betancourt", director = "Javier Betancourt", day = "Monday", typep = "Nuevo" );
        programas.add(p18);
        Programa p19 = new Programa ( name = "En la Agenda", startTime = 19, startMin = 0, endMin = 30, endTime = 19, description = "Un espacio para abrir las puertas a la cultura. En la agenda es una radio revista cultura que busca difundir entre los radioyentes el trabajo que realizan los colectivos y gestores culturales en la ciudad y de igual manera visibilizar y socializar los procesos que se desarrollan en la Universidad del Cauca en temas como: música, teatro, danza, pintura, diseño, poesía, literatura, cuentería, cine, entre otros. A través de este espacio se comparte también la bitácora de eventos culturales de la ciudad.", announcer = "Flordelis Urrea", director = "Flordelis Urrea", day = "Monday", typep = "Nuevo" );
        programas.add(p19);
        Programa p20 = new Programa ( name = "Cancionero", startTime = 19, startMin = 30, endMin = 30, endTime = 20, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Nuevo" );
        programas.add(p20);
        Programa p21 = new Programa ( name = "Románticas de la Noche", startTime = 20, startMin = 30, endMin = 0, endTime = 22, description = "Las voces más bonitas del cancionero romántico. Boleros, tangos, rancheras y lo que tu oído quiere escuchar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Monday", typep = "Nuevo" );
        programas.add(p21);
        Programa p23 = new Programa ( name = "Música Clásica", startTime = 22, startMin = 0, endMin = 0, endTime = 23, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Monday", typep = "Repetición" );
        programas.add(p23);
        Programa p24 = new Programa ( name = "Nuestra Música Colombiana", startTime = 23, startMin = 0, endMin = 0, endTime = 0, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Monday", typep = "Nuevo" );
        programas.add(p24);

        //endregion

        //region Martes
        Programa p25 = new Programa ( name = "Musicalidades", startTime = 0, startMin = 0, endMin = 0, endTime = 1, description = "Música para todos los gustos, para recordar y disfrutar.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Repetición" );
        programas.add(p25);
        Programa p26 = new Programa ( name = "Conexión Jazz", startTime = 1, startMin = 0, endMin = 0, endTime = 2, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Tuesday", typep = "Repetición" );
        programas.add(p26);
        Programa p27 = new Programa ( name = "Música Clásica", startTime = 2, startMin = 0, endMin = 0, endTime = 3, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Tuesday", typep = "Repetición" );
        programas.add(p27);
        Programa p28 = new Programa ( name = "Cancionero", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Repetición" );
        programas.add(p28);
        Programa p29 = new Programa ( name = "Baladas con Amor", startTime = 4, startMin = 0, endMin = 0, endTime = 5, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Repetición" );
        programas.add(p29);
        Programa p30 = new Programa ( name = "Boleros", startTime = 5, startMin = 0, endMin = 0, endTime = 6, description = "El bolero es eterno... Música para enamorar y disfrutar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Tuesday", typep = "Nuevo" );
        programas.add(p30);
        Programa p31 = new Programa ( name = "Nuestra Música Colombiana", startTime = 6, startMin = 0, endMin = 0, endTime = 7, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Nuevo" );
        programas.add(p31);
        Programa p32 = new Programa ( name = "La Franja", startTime = 7, endTime = 8, startMin = 0, endMin = 0, description = "Su formato corresponde a un programa dedicado a temas o acontecimientos universitarios de carácter informativo que en su estructura utilizan recursos mixtos propios de un magazín. La estructura de la Franja está constituida por secciones, cada una de las cuales con un objetivo claramente definido buscando aprovechar al máximo los recursos que se generan a nivel informativo y educativo en la universidad.", announcer = "Flordelis Urrea", director = "Flordelis Urrea", day = "Tuesday", typep = "Nuevo" );
        programas.add(p32);
        Programa p33 = new Programa ( name = "Ciudad Feliz", startTime = 8, startMin = 0, endMin = 0, endTime = 9, description = "Programa que presenta historias de vida, reflexiones, y temas de salud. Acompañado de  música con mensajes para la vida y la sociedad.", announcer = "", director = "", day = "Tuesday", typep = "Nuevo" );
        programas.add(p33);
        Programa p34 = new Programa ( name = "En la Agenda", startTime = 9, startMin = 0, endMin = 30, endTime = 9, description = "Un espacio para abrir las puertas a la cultura En la agenda es una radio revista cultura que busca difundir entre los radioyentes  el trabajo que realizan los colectivos y gestores culturales en la ciudad y de igual manera visibilizar y socializar los procesos que se desarrollan en  la Universidad del Cauca en temas como: música, teatro, danza, pintura, diseño,  poesía, literatura, cuentería,  cine, entre otros.  A través de este espacio se comparte también la bitácora de eventos culturales de la ciudad.", announcer = "Flordelis Urrea", director = "Flordelis Urrea", day = "Tuesday", typep = "Repetición" );
        programas.add(p34);
        Programa p35 = new Programa ( name = "Diálogos Alrededor de una Taza de Café", startTime = 9, startMin = 30, endMin = 0, endTime = 10, description = "Es un programa con formato magazín que presenta la información que se genera al interior de la Universidad del Cauca, buscando tener informada a toda la comunidad universitaria y de la región, sobre los hechos y eventos que surgen de las dinámicas Institucionales y cuyos contenidos estarán presentados en un formato ágil y dinámico. Esta propuesta está centrada en la idea de tratar los temas principales de la Universidad del Cauca, con los protagonistas y especialistas en cada uno de los temas.", announcer = "", director = "", day = "Tuesday", typep = "Nuevo" );
        programas.add(p35);
        Programa p36 = new Programa ( name = "Conexión Jazz", startTime = 10, startMin = 0, endMin = 0, endTime = 11, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Tuesday", typep = "Nuevo" );
        programas.add(p36);
        Programa p37 = new Programa ( name = "Baladas con Amor", startTime = 11, startMin = 0, endMin = 0, endTime = 12, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Nuevo" );
        programas.add(p37);
        Programa p38 = new Programa ( name = "Musicalidades", startTime = 12, startMin = 0, endMin = 0, endTime = 13, description = "Música para todos los gustos, para recordar y disfrutar.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Nuevo" );
        programas.add(p38);
        Programa p39 = new Programa ( name = "Música Clásica", startTime = 13, startMin = 0, endMin = 0, endTime = 14, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Tuesday", typep = "Nuevo" );
        programas.add(p39);
        Programa p40 = new Programa ( name = "Me Gusta", startTime = 14, startMin = 0, endMin = 0, endTime = 16, description = "Programa joven y alternativo de la radio, con lo mejor del rock, pop, reggae y ska, ME GUSTA 14.1 FM", announcer = "María Alejandra Medina", director = "María Alejandra Medina", day = "Tuesday", typep = "Nuevo" );
        programas.add(p40);
        Programa p41 = new Programa ( name = "Pasaporte Express Internacional", startTime = 16, startMin = 0, endMin = 0, endTime = 18, description = "Para viajar a través del tiempo, la música adulto contenporánea, los 70, 80 y 90 SOLO ÉXITOS - RETRO MUSIC", announcer = "Jorge Gonzáles", director = "Jorge Gonzáles", day = "Tuesday", typep = "Nuevo" );
        programas.add(p41);
        Programa p42 = new Programa ( name = "Factor RH", startTime = 18, startMin = 0, endMin = 0, endTime = 19, description = "Sólo para los que tienen espíritu joven, sin importar su edad y para quienes viven el Rock. Nació hace más de diez y seis años esta producción radiofónica, reflejando lo que son y aquello que viven los rockeros, FACTOR RH y su grupo de melómanos realizadores se encargan de presentar todo lo que tiene que ver con el mundo del ROCK, música, artistas, historia, estilos.", announcer = "Javier Betancourt", director = "Javier Betancourt", day = "Tuesday", typep = "Nuevo" );
        programas.add(p42);
        Programa p43 = new Programa ( name = "Contexto", startTime = 19, startMin = 0, endMin = 30, endTime = 19, description = "El programa busca mantener informada a la comunidad en temáticas de interés general. En el desarrollo del mismo se transmiten entrevistas, reportajes o crónicas, dependiendo de la temática planteada.", announcer = "Sandra Rojas", director = "Sandra Rojas", day = "Tuesday", typep = "Nuevo" );
        programas.add(p43);
        Programa p44 = new Programa ( name = "Cancionero", startTime = 19, startMin = 30, endMin = 30, endTime = 20, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Nuevo" );
        programas.add(p44);
        Programa p45 = new Programa ( name = "Románticas de la Noche", startTime = 20, startMin = 30, endMin = 0, endTime = 22, description = "Las voces más bonitas del cancionero romántico. Boleros, tangos, rancheras y lo que tu oído quiere escuchar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Tuesday", typep = "Nuevo" );
        programas.add(p45);
        Programa p46 = new Programa ( name = "Música Clásica", startTime = 22, startMin = 0, endMin = 0, endTime = 23, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Tuesday", typep = "Repetición" );
        programas.add(p46);
        Programa p47 = new Programa ( name = "Nuestra Música Colombiana", startTime = 23, startMin = 0, endMin = 0, endTime = 0, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Tuesday", typep = "Nuevo" );
        programas.add(p47);
        //endregion

        //region Miércoles
        Programa p48 = new Programa ( name = "Musicalidades", startTime = 0, startMin = 0, endMin = 0, endTime = 1, description = "Música para todos los gustos, para recordar y disfrutar.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Wednesday", typep = "Repetición" );
        programas.add(p48);
        Programa p49 = new Programa ( name = "Conexión Jazz", startTime = 1, startMin = 0, endMin = 0, endTime = 2, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Wednesday", typep = "Repetición" );
        programas.add(p49);
        Programa p50 = new Programa ( name = "Música Clásica", startTime = 2, startMin = 0, endMin = 0, endTime = 3, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Wednesday", typep = "Repetición" );
        programas.add(p50);
        Programa p51 = new Programa ( name = "Cancionero", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Wednesday", typep = "Repetición" );
        programas.add(p51);
        Programa p52 = new Programa ( name = "Baladas con Amor", startTime = 4, startMin = 0, endMin = 0, endTime = 5, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Wednesday", typep = "Repetición" );
        programas.add(p52);
        Programa p53 = new Programa ( name = "Boleros", startTime = 5, startMin = 0, endMin = 0, endTime = 6, description = "El bolero es eterno... Música para enamorar y disfrutar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Wednesday", typep = "Nuevo" );
        programas.add(p53);
        Programa p54 = new Programa ( name = "Nuestra Música Colombiana", startTime = 6, startMin = 0, endMin = 0, endTime = 7, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Wednesday", typep = "Nuevo" );
        programas.add(p54);
        Programa p55 = new Programa ( name = "La Franja", startTime = 7, startMin = 0, endMin = 0, endTime = 8, description = "Su formato corresponde a un programa dedicado a temas o acontecimientos universitarios de carácter informativo que en su estructura utilizan recursos mixtos propios de un magazín. La estructura de la Franja está constituida por secciones, cada una de las cuales con un objetivo claramente definido buscando aprovechar al máximo los recursos que se generan a nivel informativo y educativo en la universidad.", announcer = "Flordelis Urrea", director = "Flordelis Urrea", day = "Wednesday", typep = "Nuevo" );
        programas.add(p55);
        Programa p56 = new Programa ( name = "Ciudad Feliz", startTime = 8, startMin = 0, endMin = 0, endTime = 9, description = "Programa que presenta historias de vida, reflexiones, y temas de salud. Acompañado de  música con mensajes para la vida y la sociedad.", announcer = "", director = "", day = "Wednesday", typep = "Nuevo" );
        programas.add(p56);
        Programa p57 = new Programa ( name = "Crianza Feliz", startTime = 9, startMin = 0, endMin = 30, endTime = 9, description = "Promoción de la salud y la educación para el bienestar del niño o niña y su familia.", announcer = "Jaime Bonilla", director = "Jaime Bonilla", day = "Wednesday", typep = "Nuevo" );
        programas.add(p57);
        Programa p58 = new Programa ( name = "Convocatoria Radial", startTime = 9, startMin = 30, endMin = 0, endTime = 10, description = "Espacio destinado a nuevas propuestas radiales, producto de la convocatoria de Unicauca Estereo 214", announcer = "", director = "", day = "Wednesday", typep = "Nuevo" );
        programas.add(p58);
        Programa p59 = new Programa ( name = "Conexión Jazz", startTime = 10, startMin = 0, endMin = 0, endTime = 11, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Wednesday", typep = "Nuevo" );
        programas.add(p59);
        Programa p60 = new Programa ( name = "Especiales Baladas con Amor", startTime = 11, startMin = 0, endMin = 0, endTime = 13, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Wednesday", typep = "Nuevo" );
        programas.add(p60);
        Programa p61 = new Programa ( name = "Música Clásica", startTime = 13, startMin = 0, endMin = 0, endTime = 14, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Wednesday", typep = "Nuevo" );
        programas.add(p61);
        Programa p62 = new Programa ( name = "Me Gusta", startTime = 14, startMin = 0, endMin = 0, endTime = 16, description = "Programa joven y alternativo de la radio, con lo mejor del rock, pop, reggae y ska, ME GUSTA 14.1 FM", announcer = "María Alejandra Medina", director = "María Alejandra Medina", day = "Wednesday", typep = "Nuevo" );
        programas.add(p62);
        Programa p63 = new Programa ( name = "Pasaporte Express Internacional", startTime = 16, startMin = 0, endMin = 0, endTime = 18, description = "Para viajar a través del tiempo, la música adulto contenporánea, los 70, 80 y 90 SOLO ÉXITOS - RETRO MUSIC", announcer = "Jorge Gonzáles", director = "Jorge Gonzáles", day = "Wednesday", typep = "Nuevo" );
        programas.add(p63);
        Programa p64 = new Programa ( name = "Factor RH", startTime = 18, startMin = 0, endMin = 0, endTime = 19, description = "Sólo para los que tienen espíritu joven, sin importar su edad y para quienes viven el Rock. Nació hace más de diez y seis años esta producción radiofónica, reflejando lo que son y aquello que viven los rockeros, FACTOR RH y su grupo de melómanos realizadores se encargan de presentar todo lo que tiene que ver con el mundo del ROCK, música, artistas, historia, estilos.", announcer = "Javier Betancourt", director = "Javier Betancourt", day = "Wednesday", typep = "Nuevo" );
        programas.add(p64);
        Programa p65 = new Programa ( name = "ASPU-Análisis", startTime = 19, startMin = 0, endMin = 30, endTime = 19, description = "Analisis universitario es el programa radial de la Asociación Sindical de Profesores Universitarios, ASPU-Cauca. Se trata de un programa de análisis y crítica del acontecer universitario en la Universidad del Cauca como universidad pública y de temas de la Educacion Superior en Colombia, dirigido a la comunidad universitaria y la audiencia de la región. Se discute la agenda universitaria a través de la entrevista de un universitario, generalmente representante de los profesores en las distintas instancias universitarias o se invita a la directiva actual universitaria para la difusión o analisis crítico de sus programas.", announcer = "Olga Lucía Sanabria", director = "Olga Lucía Sanabria", day = "Wednesday", typep = "Nuevo" );
        programas.add(p65);
        Programa p66 = new Programa ( name = "Cancionero", startTime = 19, startMin = 30, endMin = 30, endTime = 20, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Wednesday", typep = "Nuevo" );
        programas.add(p66);
        Programa p67 = new Programa ( name = "Románticas de la Noche", startTime = 20, startMin = 30, endMin = 0, endTime = 22, description = "Las voces más bonitas del cancionero romántico. Boleros, tangos, rancheras y lo que tu oído quiere escuchar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Wednesday", typep = "Nuevo" );
        programas.add(p67);
        Programa p68 = new Programa ( name = "Música Clásica", startTime = 22, startMin = 0, endMin = 0, endTime = 23, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Wednesday", typep = "Repetición" );
        programas.add(p68);
        Programa p69 = new Programa ( name = "Nuestra Música Colombiana", startTime = 23, startMin = 0, endMin = 0, endTime = 0, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Wednesday", typep = "Nuevo" );
        programas.add(p69);
        //endregion

        //region Jueves
        Programa p70 = new Programa ( name = "Musicalidades", startTime = 0, startMin = 0, endMin = 0, endTime = 1, description = "Música para todos los gustos, para recordar y disfrutar.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Repetición" );
        programas.add(p70);
        Programa p71 = new Programa ( name = "Conexión Jazz", startTime = 1, startMin = 0, endMin = 0, endTime = 2, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Thursday", typep = "Repetición" );
        programas.add(p71);
        Programa p72 = new Programa ( name = "Música Clásica", startTime = 2, startMin = 0, endMin = 0, endTime = 3, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Thursday", typep = "Repetición" );
        programas.add(p72);
        Programa p73 = new Programa ( name = "Cancionero", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Repetición" );
        programas.add(p73);
        Programa p74 = new Programa ( name = "Baladas con Amor", startTime = 4, startMin = 0, endMin = 0, endTime = 5, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Repetición" );
        programas.add(p74);
        Programa p75 = new Programa ( name = "Boleros", startTime = 5, startMin = 0, endMin = 0, endTime = 6, description = "El bolero es eterno... Música para enamorar y disfrutar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Thursday", typep = "Nuevo" );
        programas.add(p75);
        Programa p76 = new Programa ( name = "Nuestra Música Colombiana", startTime = 6, startMin = 0, endMin = 0, endTime = 7, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Nuevo" );
        programas.add(p76);
        Programa p77 = new Programa ( name = "La Franja", startTime = 7, startMin = 0, endMin = 0, endTime = 8, description = "Su formato corresponde a un programa dedicado a temas o acontecimientos universitarios de carácter informativo que en su estructura utilizan recursos mixtos propios de un magazín. La estructura de la Franja está constituida por secciones, cada una de las cuales con un objetivo claramente definido buscando aprovechar al máximo los recursos que se generan a nivel informativo y educativo en la universidad.", announcer = "Flordelis Urrea", director = "Flordelis Urrea", day = "Thursday", typep = "Nuevo" );
        programas.add(p77);
        Programa p78 = new Programa ( name = "Ciudad Feliz", startTime = 8, startMin = 0, endMin = 0, endTime = 9, description = "Programa que presenta historias de vida, reflexiones, y temas de salud. Acompañado de  música con mensajes para la vida y la sociedad.", announcer = "", director = "", day = "Thursday", typep = "Nuevo" );
        programas.add(p78);
        Programa p79 = new Programa ( name = "Convocatoria Radial", startTime = 9, startMin = 0, endMin = 0, endTime = 10, description = "Espacio destinado a nuevas propuestas radiales, producto de la convocatoria de Unicauca Estereo 214", announcer = "", director = "", day = "Thursday", typep = "Nuevo" );
        programas.add(p79);
        Programa p80 = new Programa ( name = "Conexión Jazz", startTime = 10, startMin = 0, endMin = 0, endTime = 11, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen para crearlo.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Thursday", typep = "Nuevo" );
        programas.add(p80);
        Programa p81 = new Programa ( name = "Baladas con Amor", startTime = 11, startMin = 0, endMin = 0, endTime = 12, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Nuevo" );
        programas.add(p81);
        Programa p82 = new Programa ( name = "Musicalidades", startTime = 12, startMin = 0, endMin = 0, endTime = 13, description = "Música para todos los gustos, para recordar y disfrutar.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Nuevo" );
        programas.add(p82);
        Programa p83 = new Programa ( name = "Música Clásica", startTime = 13, startMin = 0, endMin = 0, endTime = 14, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Thursday", typep = "Nuevo" );
        programas.add(p83);
        Programa p84 = new Programa ( name = "Me Gusta", startTime = 14, startMin = 0, endMin = 0, endTime = 16, description = "Programa joven y alternativo de la radio, con lo mejor del rock, pop, reggae y ska, ME GUSTA 14.1 FM", announcer = "María Alejandra Medina", director = "María Alejandra Medina", day = "Thursday", typep = "Nuevo" );
        programas.add(p84);
        Programa p85 = new Programa ( name = "Pasaporte Express Internacional", startTime = 16, startMin = 0, endMin = 0, endTime = 18, description = "Para viajar a través del tiempo, la música adulto contenporánea, los 70, 80 y 90 SOLO ÉXITOS - RETRO MUSIC", announcer = "Jorge Gonzáles", director = "Jorge Gonzáles", day = "Thursday", typep = "Nuevo" );
        programas.add(p85);
        Programa p86 = new Programa ( name = "Factor RH", startTime = 18, startMin = 0, endMin = 0, endTime = 19, description = "Sólo para los que tienen espíritu joven, sin importar su edad y para quienes viven el Rock. Nació hace más de diez y seis años esta producción radiofónica, reflejando lo que son y aquello que viven los rockeros, FACTOR RH y su grupo de melómanos realizadores se encargan de presentar todo lo que tiene que ver con el mundo del ROCK, música, artistas, historia, estilos.", announcer = "Javier Betancourt", director = "Javier Betancourt", day = "Thursday", typep = "Nuevo" );
        programas.add(p86);
        Programa p87 = new Programa ( name = "Consultorio Jurídico", startTime = 19, startMin = 0, endMin = 30, endTime = 19, description = "Consultorio Jurídico es un programa radial de la Facultad de Derecho, Ciencias Políticas y Sociales, atenta a prestar su colaboración ante las necesidades jurídicas de las personas de bajos recursos económicos y de entidades que requieran sus servicios.", announcer = "Jacob Cuellar", director = "Jacob Cuellar", day = "Thursday", typep = "Nuevo" );
        programas.add(p87);
        Programa p88 = new Programa ( name = "Cancionero", startTime = 19, startMin = 30, endMin = 30, endTime = 20, description = "Disfruta y vive lo mejor de la música latinoamericana.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Nuevo" );
        programas.add(p88);
        Programa p89 = new Programa ( name = "Románticas de la Noche", startTime = 20, startMin = 30, endMin = 0, endTime = 22, description = "Las voces más bonitas del cancionero romántico. Boleros, tangos, rancheras y lo que tu oído quiere escuchar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Thursday", typep = "Nuevo" );
        programas.add(p89);
        Programa p90 = new Programa ( name = "Música Clásica", startTime = 22, startMin = 0, endMin = 0, endTime = 23, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Thursday", typep = "Repetición" );
        programas.add(p90);
        Programa p91 = new Programa ( name = "Nuestra Música Colombiana", startTime = 23, startMin = 0, endMin = 0, endTime = 0, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Thursday", typep = "Nuevo" );
        programas.add(p91);
        //endregion

        //region Viernes
        Programa p92 = new Programa ( name = "A State of Trance", startTime = 0, startMin = 0, endMin = 0, endTime = 2, description = "Disfruta de las mejores mezclas de melodías de trance y progressive desde Ibiza.", announcer = "Jorge Gonzáles", director = "Victoria Moncayo", day = "Friday", typep = "Nuevo" );
        programas.add(p92);

        Programa p93 = new Programa ( name = "Pacha Recordings", startTime = 2, startMin = 0, endMin = 0, endTime = 3, description = "DJs y productores procedentes de todo el mundo se reúnen para traernos mezclas de música house.", announcer = "Jorge Gonzáles", director = "Jorge Gonzáles", day = "Friday", typep = "Nuevo" );
        programas.add(p93);

        Programa p94 = new Programa ( name = "Musical 3 AM", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = " ", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Friday", typep = "Nuevo" );
        programas.add(p94);

        Programa p95 = new Programa ( name = "Musical 3 AM", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = " ", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Friday", typep = "Nuevo" );
        programas.add(p95);

        Programa p96 = new Programa ( name = "Concierto Caribe", startTime = 4, startMin = 0, endMin = 0, endTime = 5, description = "Con lo mejor de la cultura del caribe.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Friday", typep = "Repetición" );
        programas.add(p96);

        Programa p97 = new Programa ( name = "Concierto Caribe", startTime = 4, startMin = 0, endMin = 0, endTime = 5, description = "Con lo mejor de la cultura del caribe.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Friday", typep = "Repetición" );
        programas.add(p97);

        Programa p98 = new Programa ( name = "Boleros", startTime = 5, startMin = 0, endMin = 0, endTime = 6, description = "El bolero es eterno... Música para enamorar y disfrutar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Friday", typep = "Nuevo" );
        programas.add(p98);

        Programa p99 = new Programa ( name = "Nuestra Música Colombiana", startTime = 6, startMin = 0, endMin = 0, endTime = 7, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos.", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Friday", typep = "Nuevo" );
        programas.add(p99);

        Programa p113 = new Programa ( name = "La Franja", startTime = 7, startMin = 0, endMin = 0, endTime = 8, description = "La Franja es el programa de Unicauca Estéreo que se emite los lunes a viernes de 7 a 8 de la mañana. Su formato corresponde a un programa dedicado a temas o acontecimientos universitarios de carácter informativo que en su estructura utilizan recursos mixtos propios de un magazín. La Franja emitió por primera vez el 22 de octubre del año 27 con una periodicidad diaria, durante una hora y desde el 7 de febrero se empezó a emitir durante media hora abordando solamente los temas universitarios. La estructura de la Franja está constituida por secciones, cada una de las cuales con un objetivo claramente definido buscando aprovechar al máximo los recursos que se generan a nivel informativo y educativo en la universidad.", announcer = "Flordelis Urrea", director = "Flordelis Urrea", day = "Friday", typep = "Nuevo" );
        programas.add(p113);

        Programa p100 = new Programa ( name = "Ciudad Feliz", startTime = 8, startMin = 0, endMin = 0, endTime = 9, description = "Programa que presenta historias de vida, reflexiones, y temas de salud. Acompañado de  música con mensajes para la vida y la sociedad.", announcer = " ", director = " ", day = "Friday", typep = "Nuevo" );
        programas.add(p10);

        Programa p101 = new Programa ( name = "Escenario Deportivo", startTime = 9, startMin = 0, endMin = 30, endTime = 9, description = "Escenario deportivo es un espacio que te informa sobre todos los acontecimientos deportivos que se llevan a cabo en la universidad, la  ciudad y todo el departamento: es un programa que permite interactuar con los diferentes actores del deporte y sus historias de vida, haciendo de este espacio un punto para debatir e informar.", announcer = "Miledy Avirama", director = "Miledy Avirama", day = "Friday", typep = "Nuevo" );
        programas.add(p11);

        Programa p102 = new Programa ( name = "Amor a la Salud", startTime = 9 , startMin = 30, endMin = 0, endTime = 10, description = "El programa Amor a la Salud es una iniciativa de promoción de la cultura del cuidado a partir de la actividad física y los hábitos saludables liderado por el programa de fisioterapia, tenemos varios focos de intervención uno de los cuales es los medios de comunicación universitarios, específicamente radio y televisión de Unicauca. Se combinan la experiencia del especialista con la vivencia de los participantes de amor a la salud o los testimonios de personas que sufren alguna y otra enfermedad crónica no transmisible convirtiéndose en programas de formato dinámico que agradables para la audiencia.", announcer = " ", director = " ", day = "Friday", typep = "Nuevo" );
        programas.add(p12);

        Programa p103 = new Programa ( name = "Conexión Jazz", startTime = 10, startMin = 0, endMin = 0, endTime = 11, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen entre sí para crearlo…", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Friday", typep = "Nuevo" );
        programas.add(p13);

        Programa p104 = new Programa ( name = "Baladas con Amor", startTime = 11, startMin = 0, endMin = 0, endTime = 12, description = "Baladas de ayer, de hoy y de siempre.....", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Friday", typep = "Nuevo" );
        programas.add(p14);

        Programa p105 = new Programa ( name = "Musicalidades", startTime = 12, startMin = 0, endMin = 0, endTime = 13, description = "Música para todos los gustos, para recordar y disfrutar", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Friday", typep = "Nuevo" );
        programas.add(p15);

        Programa p106 = new Programa ( name = "Música Clasica", startTime = 13, startMin = 0, endMin = 0, endTime = 14, description = "Espacio radial que difunde la creación de los grandes maestros en las diferentes periodos de la historia de la música", announcer = "Ana Milena López", director = "Ana Milena López", day = "Friday", typep = "Nuevo" );
        programas.add(p16);

        Programa p107 = new Programa ( name = "Me Gusta", startTime = 14, startMin = 0, endMin = 0, endTime = 16, description = "Programa joven y alternativo de la radio, con lo mejor del rock, pop, reggae y ska, ME GUSTA 14.1 FM", announcer = "María Alejandra Medina", director = "María Alejandra Medina", day = "Friday", typep = "Nuevo" );
        programas.add(p17);

        Programa p108 = new Programa ( name = "Pasaporte Express Internacional", startTime = 16, startMin = 0, endMin = 0, endTime = 18, description = "Para viajar a través del tiempo, la música adulto contenporánea, los 70, 80 y 90 SOLO ÉXITOS - RETRO MUSIC", announcer = "Jorge Gonzales", director = "Jorge Gonzales", day = "Friday", typep = "Nuevo" );
        programas.add(p18);

        Programa p109 = new Programa ( name = "Factor RH", startTime = 18, startMin = 0, endMin = 0, endTime = 19, description = "Sólo para los que tienen espíritu joven, sin importar su edad y para quienes viven el Rock. Nació hace más de diez y seis años esta producción radiofónica, reflejando lo que son y aquello que viven los rockeros, FACTOR RH y su grupo de melómanos realizadores se encargan de presentar todo lo que tiene que ver con el mundo del ROCK, música, artistas, historia, estilos.", announcer = "Javier Betancour", director = "Javier Betancour", day = "Friday", typep = "Nuevo" );
        programas.add(p19);

        Programa p110 = new Programa ( name = "Kirameki Ongaku", startTime = 19, startMin = 0, endMin = 0, endTime = 20, description = "Una alternativa diseñada para ti. Un programa con diferentes géneros musicales, con énfasis en música oriental y una alternativa a una radio diferente. Nuestro Programa busca un lugar donde te sientas cómodo  disfrutando lo que más te gusta j-rock, k-pop, anime, videojuegos, cuentos y mucho más. Todos los viernes de 7pm a 8pm en Unicauca estéreo 14.1", announcer = "Ángela María Rodríguez", director = "Victor Martínez", day = "Friday", typep = "Nuevo" );
        programas.add(p110);

        Programa p111 = new Programa ( name = "Goce Cubano", startTime = 20, startMin = 0, endMin = 0, endTime = 22, description = "Tertulia al son de la música, los poemas y el amor...", announcer = "Ricardo Paz", director = "Ricardo Paz", day = "Friday", typep = "Nuevo" );
        programas.add(p111);

        Programa p112 = new Programa ( name = "Pacha Recordings", startTime = 22, startMin = 0, endMin = 0, endTime = 23, description = "DJs y productores procedentes de todo el mundo se reúnen para traernos mezclas de música house.", announcer = "Jorge Gonzales", director = "Jorge Gonzales", day = "Friday", typep = "Nuevo" );
        programas.add(p112);

        Programa p114 = new Programa ( name = "D.J Sessions", startTime = 23, startMin = 0, endMin = 0, endTime = 24, description = "Programa de música electrónica que trae las mejores mezclas de DJs", announcer = "Jorge Gonzales", director = "Jorge Gonzales", day = "Friday", typep = "Nuevo" );
        programas.add(p114);
        //endregion

        //region Sabado
        Programa p115 = new Programa ( name = "Latín Jazz", startTime = 0, startMin = 0, endMin = 0, endTime = 2, description = "Lo mejor de jazz latino aquí en la frecuencia 14.1 fm.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Saturday", typep = "Repetición" );
        programas.add(p115);

        Programa p116 = new Programa ( name = "Escucha el Mundo", startTime = 2, startMin = 0, endMin = 0, endTime = 3, description = "Da una vuelta musical por el mundo ", announcer = "Ana Milena López", director = "Ana Milena López", day = "Saturday", typep = "Nuevo" );
        programas.add(p116);

        Programa p117 = new Programa ( name = "Nuestra Música Colombiana", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Saturday", typep = "Repetición" );
        programas.add(p117);

        Programa p118 = new Programa ( name = "Boleros", startTime = 4, startMin = 0, endMin = 0, endTime = 6, description = "El bolero es eterno... Música para enamorar y disfrutar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Saturday", typep = "Nuevo" );
        programas.add(p118);

        Programa p119 = new Programa ( name = "Nuestra Música Colombiana", startTime = 6, startMin = 0, endMin = 0, endTime = 7, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Saturday", typep = "Nuevo" );
        programas.add(p119);

        Programa p120 = new Programa ( name = "Semillas", startTime = 7, startMin = 0, endMin = 0, endTime = 8, description = "Programa dedicado al agro ", announcer = "Juan Pablo Paz", director = "Juan Pablo Paz", day = "Saturday", typep = "Nuevo" );
        programas.add(p120);

        Programa p121 = new Programa ( name = "Radio Universitaria", startTime = 8, startMin = 0, endMin = 30, endTime = 8, description = "", announcer = "", director = "", day = "Saturday", typep = "Nuevo" );
        programas.add(p121);

        Programa p122 = new Programa ( name = "Contexto", startTime = 8, startMin = 30, endMin = 0, endTime = 9, description = "El programa busca mantener informada a la comunidad en temáticas de interés general. En el desarrollo del mismo se transmiten entrevistas, reportajes o crónicas, dependiendo de la temática planteada.", announcer = "Sandra Rojas", director = "Sandra Rojas", day = "Saturday", typep = "Repetición" );
        programas.add(p122);

        Programa p123 = new Programa ( name = "Crianza Feliz", startTime = 9, startMin = 0, endMin = 30, endTime = 9, description = "Promoción de la salud y la educación para el bienestar del niño o niña y su familia.", announcer = "Jaime Bonilla", director = "Jaime Bonilla", day = "Saturday", typep = "Repetición" );
        programas.add(p123);

        Programa p124 = new Programa ( name = "Onda Mágica", startTime = 9, startMin = 30, endMin = 30, endTime = 10, description = "Y tu ya haces parte de la onda de los niños y las niñas. ", announcer = "Javier Zapata", director = "Javier Zapata", day = "Saturday", typep = "Nuevo" );
        programas.add(p124);

        Programa p125 = new Programa ( name = "Travesías", startTime = 10, startMin = 30, endMin = 30, endTime = 11, description = "", announcer = "", director = "", day = "Saturday", typep = "Nuevo" );
        programas.add(p125);

        Programa p126 = new Programa ( name = "Consultorio Jurídico", startTime = 11, startMin = 30, endMin = 0, endTime = 12, description = "Consultorio Jurídico es un programa radial de la Facultad de Derecho, Ciencias Políticas y Sociales, atenta a prestar su colaboración ante las necesidades jurídicas de las personas de bajos recursos económicos y de entidades que requieran sus servicios.", announcer = "Jacob Cuellar", director = "Jacob Cuellar", day = "Saturday", typep = "Repetición" );
        programas.add(p126);

        Programa p127 = new Programa ( name = "Radio Cinema", startTime = 12, startMin = 0, endMin = 0, endTime = 13, description = "Radio Cinema es el espacio para acercarlos al mundo del cine, a su historia, su lenguaje, personajes inolvidables y anécdotas. En radio Cinema compartiremos  las bandas sonoras que acompañan y complementan cada producción cinematográfica, traeremos para ustedes películas comerciales e independientes de todos los continentes, festivales y talleres propuestos de cinematografía en el país y las  opciones de la cartelera a nivel mundial .", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Saturday", typep = "Nuevo" );
        programas.add(p127);

        Programa p128 = new Programa ( name = "Latin Jazz", startTime = 13, startMin = 0, endMin = 0, endTime = 15, description = "Lo mejor de jazz latino aquí en la frecuencia 14.1 fm.", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Saturday", typep = "Nuevo" );
        programas.add(p128);

        Programa p129 = new Programa ( name = "Concierto Caribe", startTime = 15, startMin = 0, endMin = 0, endTime = 16, description = "Con lo mejor de la cultura del caribe.", announcer = "Ana Milena López", director = "Ana Milena López", day = "Saturday", typep = "Nuevo" );
        programas.add(p129);

        Programa p130 = new Programa ( name = "Solar Antillano", startTime = 16, startMin = 0, endMin = 0, endTime = 18, description = "Programa radial dedicado al rescate, promoción y difusión de la música conocida bajo el término genérico de afrolatina. Semanalmente se abordan temáticas que van desde la descripción de un género en particular, la vida y obra de un artista o agrupación. En ocasiones se tienen invitados especiales ya sea en la propia cabina de transmisión o a través de la línea telefónica y se promocionan los eventos que tienen que ver con la materia.", announcer = "Eduardo Roa", director = "Eduardo Roa", day = "Saturday", typep = "Nuevo" );
        programas.add(p130);

        Programa p131 = new Programa ( name = "Factor RH", startTime = 18, startMin = 0, endMin = 0, endTime = 19, description = "Sólo para los que tienen espíritu joven, sin importar su edad y para quienes viven el Rock. Nació hace más de diez y seis años esta producción radiofónica, reflejando lo que son y aquello que viven los rockeros, FACTOR RH y su grupo de melómanos realizadores se encargan de presentar todo lo que tiene que ver con el mundo del ROCK, música, artistas, historia, estilos.", announcer = "Javier Betancour", director = "Javier Betancour", day = "Saturday", typep = "Nuevo" );
        programas.add(p131);

        Programa p132 = new Programa ( name = "Ritmos y Cantares", startTime = 19, startMin = 0, endMin = 0, endTime = 21, description = "Programa en el que puedes disfrutar la música afrocaribeña, acompañada de datos importantes de los artistas o agrupaciones. También entérese de eventos culturales que se realizan en la universidad, la ciudad y en el país.", announcer = "Kelly Muñoz Lara", director = "Enrique Mosquera Vidal", day = "Saturday", typep = "Nuevo" );
        programas.add(p132);

        Programa p133 = new Programa ( name = "Noche Latina", startTime = 21, startMin = 0, endMin = 0, endTime = 0, description = "Los ritmos latinos se reúnen para disfrutar la noche sabatina. Disfruta de información artistica, institucional, eventos, y mucho más.  ", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Saturday", typep = "Nuevo" );
        programas.add(p133);
        //endregion

        //region Domingo
        Programa p134 = new Programa ( name = "Under Waves", startTime = 0, startMin = 0, endMin = 0, endTime = 2, description = "", announcer = "", director = "", day = "Sunday", typep = "Nuevo" );
        programas.add(p134);

        Programa p135 = new Programa ( name = "Tango City Tour", startTime = 2, startMin = 0, endMin = 0, endTime = 3, description = "Una forma diferente de escuchar y entender el tango ", announcer = "Ana Milena López", director = "Ana Milena López", day = "Sunday", typep = "Nuevo" );
        programas.add(p135);

        Programa p136 = new Programa ( name = "Nuestra Música Colombiana", startTime = 3, startMin = 0, endMin = 0, endTime = 4, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Sunday", typep = "Repetición" );
        programas.add(p136);

        Programa p137 = new Programa ( name = "Boleros", startTime = 4, startMin = 0, endMin = 0, endTime = 6, description = "El bolero es eterno... Música para enamorar y disfrutar", announcer = "Francisco Fuli", director = "Francisco Fuli", day = "Sunday", typep = "Nuevo" );
        programas.add(p137);

        Programa p138 = new Programa ( name = "Nuestra Música Colombiana", startTime = 6, startMin = 0, endMin = 0, endTime = 7, description = "Música colombiana, al son de cumbias, porros, vallenatos, pasillos, bambucos, joropos, salsa, vallenatos", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Sunday", typep = "Nuevo" );
        programas.add(p138);

        Programa p139 = new Programa ( name = "Semillas", startTime = 7, startMin = 0, endMin = 0, endTime = 8, description = "Programa dedicado al agro ", announcer = "Juan Pablo Paz", director = "Juan Pablo Paz", day = "Sunday", typep = "Nuevo" );
        programas.add(p139);

        Programa p140 = new Programa ( name = "Saberes", startTime = 8, startMin = 0, endMin = 30, endTime = 8, description = "El programa radial de la Vicerrectoría de Investigaciones de la Universidad del Cauca, llevando la ciencia, la tecnología, el emprendimiento y la innovación a tu oído. Porque conocer lo que hacen nuestros investigadores y su impacto social, es un compromiso institucional.", announcer = "María Alejandra Medina", director = "María Alejandra Medina", day = "Sunday", typep = "Repetición" );
        programas.add(p140);

        Programa p141 = new Programa ( name = "ASPU Análisis", startTime = 8, startMin = 30, endMin = 0, endTime = 9, description = "Analisis universitario es el programa radial de la Asociación Sindical de Profesores Universitarios, ASPU-Cauca. Se trata de un programa de análisis y crítica del acontecer universitario en la Universidad del Cauca como universidad pública y de temas de la Educación Superior en Colombia, dirigido a la comunidad universitaria y la audiencia de la región. Se discute la agenda universitaria a través de la entrevista de un universitario, generalmente representante de los profesores en las distintas instancias universitarias o se invita a la directiva actual universitaria para la difusión o análisis crítico de sus programas.", announcer = "Olga Lucía Sanabria", director = "Olga Lucía Sanabria", day = "Sunday", typep = "Repetición" );
        programas.add(p141);

        Programa p142 = new Programa ( name = "Tango City Tour", startTime = 9, startMin = 0, endMin = 0, endTime = 10, description = "Una forma diferente de escuchar y entender el tango ", announcer = "Ana Milena López", director = "Ana Milena López", day = "Sunday", typep = "Nuevo" );
        programas.add(p142);

        Programa p143 = new Programa ( name = "Travesías", startTime = 10, startMin = 0, endMin = 0, endTime = 11, description = "", announcer = "", director = "", day = "Sunday", typep = "Nuevo" );
        programas.add(p143);

        Programa p144 = new Programa ( name = "Escenario Deportivo", startTime = 11, startMin = 0, endMin = 0, endTime = 12, description = "Escenario deportivo es un espacio que te informa sobre todos los acontecimientos deportivos que se llevan a cabo en la universidad, la  ciudad y todo el departamento: es un programa que permite interactuar con los diferentes actores del deporte y sus historias de vida, haciendo de este espacio un punto para debatir e informar.", announcer = "Miledy Avirama", director = "Miledy Avirama", day = "Sunday", typep = "Nuevo" );
        programas.add(p144);

        Programa p145 = new Programa ( name = "Radio Cinema", startTime = 12, startMin = 0, endMin = 0, endTime = 13, description = "Radio Cinema es el espacio para acercarlos al mundo del cine, a su historia, su lenguaje, personajes inolvidables y anécdotas. En radio Cinema compartiremos  las bandas sonoras que acompañan y complementan cada producción cinematográfica, traeremos para ustedes películas comerciales e independientes de todos los continentes, festivales y talleres propuestos de cinematografía en el país y las  opciones de la cartelera a nivel mundial .", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Sunday", typep = "Repetición" );
        programas.add(p145);

        Programa p146 = new Programa ( name = "Musicalidades", startTime = 13, startMin = 0, endMin = 0, endTime = 15, description = "Música para todos los gustos, para recordar y disfrutar", announcer = "Victoria Moncayo", director = "Victoria Moncayo", day = "Sunday", typep = "Nuevo" );
        programas.add(p146);

        Programa p147 = new Programa ( name = "Escucha el Mundo", startTime = 15, startMin = 0, endMin = 0, endTime = 16, description = "Da una vuelta musical por el mundo ", announcer = "Ana Milena López", director = "Ana Milena López", day = "Sunday", typep = "Nuevo" );
        programas.add(p147);

        Programa p148 = new Programa ( name = "Algo Diferente", startTime = 16, startMin = 0, endMin = 30, endTime = 16, description = "LA DIFERENCIA ESTÁ EN ESCUCHARNOS. Somos un programa radial digital alternativo de la ciudad de Popayán Cauca Colombia especializado en música reggae y sus temas relacionados. Aquí se conoce los artistas reggae, la música nueva, los subgéneros reggae, eventos relacionados.", announcer = "Duvian Sánchez", director = "Duvian Sánchez", day = "Sunday", typep = "Nuevo" );
        programas.add(p148);

        Programa p149 = new Programa ( name = "Gospel Hits", startTime = 16, startMin = 30, endMin = 0, endTime = 18, description = "Programa especializado en música anglo y latina, que presenta un top 10 de la música más importante del nuevo rock. Con la agenda gospel entérese de la actualidad de la música gospel, anglo, latina y datos curiosos del mundo para usted. ", announcer = "Carlos Castrillón", director = "Carlos Castrillón", day = "Sunday", typep = "Nuevo" );
        programas.add(p149);

        Programa p150 = new Programa ( name = "Factor RH", startTime = 18, startMin = 0, endMin = 0, endTime = 19, description = "Sólo para los que tienen espíritu joven, sin importar su edad y para quienes viven el Rock. Nació hace más de diez y seis años esta producción radiofónica, reflejando lo que son y aquello que viven los rockeros, FACTOR RH y su grupo de melómanos realizadores se encargan de presentar todo lo que tiene que ver con el mundo del ROCK, música, artistas, historia, estilos.", announcer = "Javier Betancour", director = "Javier Betancour", day = "Sunday", typep = "Nuevo" );
        programas.add(p150);

        Programa p151 = new Programa ( name = "Jazz en Clave Caribe", startTime = 19, startMin = 0, endMin = 0, endTime = 20, description = "El encuentro del jazz y los ritmos afrocubanos ha dado como resultado el jazz afrocubano, que con el tiempo se ha reconocido universalmente como jazz latino. Una alternativa sonora para los músicos salseros de ayer que encuentran un espacio para desarrollar sus ideas, experimentando con todo tipo de expresiones musicales latinoamericanas.", announcer = "", director = "", day = "Sunday", typep = "Nuevo" );
        programas.add(p151);

        Programa p152 = new Programa ( name = "Conversación Tiempo Bolero", startTime = 20, startMin = 0, endMin = 0, endTime = 21, description = "Testimonios, historias y música de los compositores e interpretes que han forjado este genero nocturno y centenario ", announcer = "Ana Milena López", director = "Ana Milena López", day = "Sunday", typep = "Nuevo" );
        programas.add(p152);

        Programa p153 = new Programa ( name = "Conexión Jazz", startTime = 21, startMin = 0, endMin = 30, endTime = 22, description = "El jazz es una fuente inagotable de la manifestación creativa y sensible de la historia humana, sentimiento, y libertad, se unen entre sí para crearlo…", announcer = "Margarita López Manzano", director = "Margarita López Manzano", day = "Sunday", typep = "Nuevo" );
        programas.add(p153);

        Programa p154 = new Programa ( name = "Epic Soul Music", startTime = 22, startMin = 30, endMin = 0, endTime = 0, description = "Es un programa radial en el cual su principal enfoque es la presentación de temas del género musical épico, el cual es escuchado habitualmente; en vídeo juegos, películas, anime y series.", announcer = "Andrés Alejandro Paredes", director = "Andrés Alejandro Paredes", day = "Sunday", typep = "Nuevo" );
        programas.add(p154);
        //endregion Domingo



        return programas;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getStartMin() {
        return startMin;
    }

    public void setStartMin(int startMin) {
        this.startMin = startMin;
    }

    public int getEndMin() {
        return endMin;
    }

    public void setEndMin(int endMin) {
        this.endMin = endMin;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTypep() {
        return typep;
    }

    public void setTypep(String typep) {
        this.typep = typep;
    }
}
