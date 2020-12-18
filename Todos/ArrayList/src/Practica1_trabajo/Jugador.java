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
        //�ste m�todo devuelve el [nombre] de un jugador.
        public String getNombre() {
            return nombre;
        }
        //�ste m�todo actualiza el valor de nombre a [nombre].
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        //�ste m�todo devuelve el [dorsal] de un jugador.
        public int getDorsal() {
            return dorsal;
        }
        //�ste m�todo actualiza el valor de dorsal a [dorsal].
        public void setDorsal(int dorsal) {
            this.dorsal = dorsal;
        }
        //�ste m�todo devuelve los [goles] de un jugador.
        public int getGoles() {
            return goles;
        }
        //�ste m�todo actualiza el valor de goles a [goles].
        public void setGoles(int goles) {
            this.goles = goles;
        }
        //�ste m�todo devuelve las [Tarjetas Rojas] de los jugadores.
        public int getTarjetasRojas() {
            return tarjetasRojas;
        }

        //�ste m�todo actualiza el valor de Tarjetas Rojas a [Tarjetas Rojas].
        public void setTarjetasRojas(int tarjetasRojas) {
            this.tarjetasRojas = tarjetasRojas;
        }

        //�ste m�todo devuelve las [Tarjetas Amarillas] de los jugadores.
        public int getTarjetasAmarillas() {
            return tarjetasAmarillas;
        }

        //�ste m�todo devuelve el valor de Tarjetas Amarillas a [Tarjetas Amarillas].
        public void setTarjetasAmarillas(int tarjetasAmarillas) {
            this.tarjetasAmarillas = tarjetasAmarillas;
        }
        public String toString() {
        	return "Nombre " + nombre + " con goles: " + goles + " expulsiones: "+ tarjetasRojas;
        }
}
