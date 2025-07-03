package rios.carlos.crud

data class Tarea(
    var id:  String="",
    var titulo: String="",
    var descripcion: String="")
{
    fun toMap(): Map<String, String>{
        return mapOf(
            "id" to id,
            "titulo" to titulo,
            "descripcion" to descripcion
        )
    }
}
