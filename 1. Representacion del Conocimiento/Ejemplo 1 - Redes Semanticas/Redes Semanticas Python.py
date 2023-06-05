red_semantica = {
    "perro": ["animal", "mascota"],
    "gato": ["animal", "mascota"],
    "animal": ["ser vivo"],
    "mascota": ["animal domesticado"]
}

nodo = "perro"
if nodo in red_semantica:
    print(f"Relaciones de {nodo}: {', '.join(red_semantica[nodo])}")



    