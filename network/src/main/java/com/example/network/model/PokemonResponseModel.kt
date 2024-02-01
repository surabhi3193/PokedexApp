package com.example.network.model

import com.google.gson.annotations.SerializedName


data class PokemonResponseModel(
    @SerializedName("abilities") var abilities: ArrayList<Abilities> = arrayListOf(),
    @SerializedName("base_experience") var baseExperience: Int? = null,
    @SerializedName("forms") var forms: ArrayList<Forms> = arrayListOf(),
    @SerializedName("height") var height: Int? = null,
    @SerializedName("held_items") var heldItems: ArrayList<HeldItems> = arrayListOf(),
    @SerializedName("id") var id: String? = null,
    @SerializedName("is_default") var isDefault: Boolean? = null,
    @SerializedName("location_area_encounters") var locationAreaEncounters: String? = null,
    @SerializedName("moves") var moves: ArrayList<Moves> = arrayListOf(),
    @SerializedName("name") var name: String? = null,
    @SerializedName("order") var order: Int? = null,
    @SerializedName("past_abilities") var pastAbilities: ArrayList<String> = arrayListOf(),
    @SerializedName("past_types") var pastTypes: ArrayList<String> = arrayListOf(),
    @SerializedName("species") var species: Species? = Species(),
    @SerializedName("sprites") var sprites: Sprites? = Sprites(),
    @SerializedName("stats") var stats: ArrayList<Stats> = arrayListOf(),
    @SerializedName("types") var types: ArrayList<Types> = arrayListOf(),
    @SerializedName("weight") var weight: Int? = null,
)

data class Abilities(
    @SerializedName("ability") var ability: Ability? = Ability(),
    @SerializedName("is_hidden") var isHidden: Boolean? = null,
    @SerializedName("slot") var slot: Int? = null,
)

data class Ability(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

data class Forms(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)


data class HeldItems(
    @SerializedName("item") var item: Item? = Item(),
    @SerializedName("version_details") var versionDetails: ArrayList<VersionDetails> = arrayListOf(),
)

data class Item(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

data class VersionDetails(
    @SerializedName("rarity") var rarity: Int? = null,
)

data class Moves(

    @SerializedName("move") var move: Move? = Move(),
    @SerializedName("version_group_details") var versionGroupDetails: ArrayList<VersionGroupDetails> = arrayListOf(),
)

data class VersionGroupDetails(
    @SerializedName("level_learned_at") var levelLearnedAt: Int? = null,
    @SerializedName("move_learn_method") var moveLearnMethod: MoveLearnMethod? = MoveLearnMethod(),
    @SerializedName("version_group") var versionGroup: VersionGroup? = VersionGroup(),
)

data class MoveLearnMethod(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

data class VersionGroup(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

data class Move(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

data class Species(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

data class Sprites(

    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_female") var backFemale: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_female") var backShinyFemale: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
    @SerializedName("other") var other: Other? = Other(),
    @SerializedName("versions") var versions: Versions? = Versions(),
)

data class Versions(
    @SerializedName("generation-i") var generation_i: Generation_i? = Generation_i(),
    @SerializedName("generation-ii") var generation_ii: Generation_ii? = Generation_ii(),

    @SerializedName("generation-iii") var generation_iii: Generation_iii? = Generation_iii(),

    @SerializedName("generation-iv") var generation_iv: Generation_iv? = Generation_iv(),

    @SerializedName("generation-v") var generation_v: Generation_v? = Generation_v(),

    @SerializedName("generation-vi") var generation_vi: Generation_vi? = Generation_vi(),

    @SerializedName("generation-vii") var generation_vii: Generation_vii? = Generation_vii(),

    @SerializedName("generation-viii") var generation_viii: Generation_viii? = Generation_viii(),
)


data class Other(

    @SerializedName("dream_world") var dreamWorld: DreamWorld? = DreamWorld(),
    @SerializedName("home") var home: Home? = Home(),
    @SerializedName("official-artwork") var official_artwork: Official_artwork? = Official_artwork(),
    @SerializedName("showdown") var showdown: Showdown? = Showdown(),
)


data class DreamWorld(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
)

data class Home(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Official_artwork(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
)

data class Showdown(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_female") var backFemale: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_female") var backShinyFemale: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Generation_i(
    @SerializedName("red-blue") var red_blue: Red_blue? = Red_blue(),
    @SerializedName("yellow") var yellow: Yellow? = Yellow(),
)

data class Red_blue(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_gray") var backGray: String? = null,
    @SerializedName("back_transparent") var backTransparent: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_gray") var frontGray: String? = null,
    @SerializedName("front_transparent") var frontTransparent: String? = null,
)

data class Yellow
    (
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_gray") var backGray: String? = null,
    @SerializedName("back_transparent") var backTransparent: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_gray") var frontGray: String? = null,
    @SerializedName("front_transparent") var frontTransparent: String? = null,
)

data class Generation_ii(
    @SerializedName("crystal") var crystal: Crystal? = Crystal(),
    @SerializedName("gold") var gold: Gold? = Gold(),
    @SerializedName("silver") var silver: Silver? = Silver(),
)

data class Crystal(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_transparent") var backShinyTransparent: String? = null,
    @SerializedName("back_transparent") var backTransparent: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_transparent") var frontShinyTransparent: String? = null,
    @SerializedName("front_transparent") var frontTransparent: String? = null,
)

data class Gold(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_transparent") var frontTransparent: String? = null,
)

data class Silver(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_transparent") var frontTransparent: String? = null,
)

data class Generation_iii(
    @SerializedName("emerald") var emerald: Emerald? = Emerald(),
    @SerializedName("firered-leafgreen") var firered_leafgreen: Firered_leafgreen? = Firered_leafgreen(),
    @SerializedName("ruby-sapphire") var ruby_sapphire: Ruby_sapphire? = Ruby_sapphire(),
)

data class Emerald(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
)

data class Firered_leafgreen(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
)

data class Ruby_sapphire(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
)

data class Generation_iv(
    @SerializedName("diamond-pearl") var diamond_pearl: Diamond_pearl? = Diamond_pearl(),
    @SerializedName("heartgold-soulsilver") var heartgold_soulsilver: Heartgold_soulsilver? = Heartgold_soulsilver(),
    @SerializedName("platinum") var platinum: Platinum? = Platinum(),
)

data class Diamond_pearl(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_female") var backFemale: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_female") var backShinyFemale: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Heartgold_soulsilver(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_female") var backFemale: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_female") var backShinyFemale: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Platinum(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_female") var backFemale: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_female") var backShinyFemale: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Generation_v(
    @SerializedName("black-white") var black_white: Black_white? = Black_white(),
)

data class Black_white(
    @SerializedName("animated") var animated: Animated? = Animated(),
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_female") var backFemale: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_female") var backShinyFemale: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Animated(
    @SerializedName("back_default") var backDefault: String? = null,
    @SerializedName("back_female") var backFemale: String? = null,
    @SerializedName("back_shiny") var backShiny: String? = null,
    @SerializedName("back_shiny_female") var backShinyFemale: String? = null,
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Generation_vi(
    @SerializedName("omegaruby-alphasapphire") var omegaruby_alphasapphire: Omegaruby_alphasapphire? = Omegaruby_alphasapphire(),
    @SerializedName("x-y") var x_y: X_y? = X_y(),
)

data class X_y(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Omegaruby_alphasapphire(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Generation_vii(
    @SerializedName("icons") var icons: Icons? = Icons(),
    @SerializedName("ultra-sun-ultra-moon") var ultra_sun_ultra_moon: Ultra_sun_ultra_moon? = Ultra_sun_ultra_moon(),
)

data class Ultra_sun_ultra_moon(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
    @SerializedName("front_shiny") var frontShiny: String? = null,
    @SerializedName("front_shiny_female") var frontShinyFemale: String? = null,
)

data class Generation_viii(
    @SerializedName("icons") var icons: Icons? = Icons(),
)


data class Icons(
    @SerializedName("front_default") var frontDefault: String? = null,
    @SerializedName("front_female") var frontFemale: String? = null,
)

data class Stats(

    @SerializedName("base_stat") var baseStat: Int? = null,
    @SerializedName("effort") var effort: Int? = null,
    @SerializedName("stat") var stat: Stat? = Stat(),
)

data class Stat(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

data class Types(
    @SerializedName("slot") var slot: Int? = null,
    @SerializedName("type") var type: Type? = Type(),
)

data class Type(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
)

