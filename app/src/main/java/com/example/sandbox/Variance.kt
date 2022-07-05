class Barrel<out T>(val item: T)

fun main(args: Array<String>) {
    var fedoraBarrel: Barrel<Fedora> =
        Barrel(Fedora("a generic looking fedora", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15))
//    var lootBarrel: Barrel<Loot> = Barrel(Fedora("a generic looking fedora 2", 25))

    lootBarrel = fedoraBarrel
//    lootBarrel.item = Coin(15)
    val myFedora: Fedora = lootBarrel.item
}