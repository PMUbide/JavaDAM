package Practica1_trabajo;


    public class Jugador {
        private String nombre;
        private int dorsal;
        private int goles;
        private int tarjetasRojas;
        private int tarjetasAmarillas;

        public Jugador(String nombre, int dorsal, int goles,
                int tarjetasRojas, int tarjetasAmarillas) {
            this.nombre = nombre;
            this.dorsal = dorsal;
            this.goles = goles;
            this.tarjetasRojas = tarjetasRojas;
            this.tarjetasAmarillas = tarjetasAmarillas;

        }
        //Éste método devuelve el [nombre] de un jugador.
        public String getNombre() {
            return nombre;
        }
        //Éste método actualiza el valor de nombre a [nombre].
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        //Éste método devuelve el [dorsal] de un jugador.
        public int getDorsal() {
            return dorsal;
        }
        //Éste método actualiza el valor de dorsal a [dorsal].
        public void setDorsal(int dorsal) {
            this.dorsal = dorsal;
        }
        //Éste método devuelve los [goles] de un jugador.
        public int getGoles() {
            return goles;
        }
        //Éste método actualiza el valor de goles a [goles].
        public void setGoles(int goles) {
            this.goles = goles;
        }
        //Éste método devuelve las [Tarjetas Rojas] de los jugadores.
        public int getTarjetasRojas() {
            return tarjetasRojas;
        }

        //Éste método actualiza el valor de Tarjetas Rojas a [Tarjetas Rojas].
        public void setTarjetasRojas(int tarjetasRojas) {
            this.tarjetasRojas = tarjetasRojas;
        }

        //Éste método devuelve las [Tarjetas Amarillas] de los jugadores.
        public int getTarjetasAmarillas() {
            return tarjetasAmarillas;
        }

        //Éste método devuelve el valor de Tarjetas Amarillas a [Tarjetas Amarillas].
        public void setTarjetasAmarillas(int tarjetasAmarillas) {
            this.tarjetasAmarillas = tarjetasAmarillas;
        }
        public String toString() {
        	return "Nombre " + nombre + " con goles: " + goles + " expulsiones: "+ tarjetasRojas;
        }
}
