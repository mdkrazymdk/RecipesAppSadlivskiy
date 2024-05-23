package com.example.recipesapp

import com.example.recipesapp.models.Category
import com.example.recipesapp.models.Ingredient
import com.example.recipesapp.models.Recipe

object STUB {
    private val categoriesList = listOf<Category>(

        Category(
            0,
            "Burgers",
            "Recipes of all popular types of burgers",
            "burger.png"
        ),
        Category(
            1,
            "Desserts",
            "The most delicious dessert recipes just for you",
            "dessert.png"
        ),
        Category(
            2,
            "Pizza",
            "Pizza for every taste and color. The best selection for you",
            "pizza.png"
        ),
        Category(
            3,
            "Fish",
            "Baked, fried, dried, any fish to your taste",
            "fish.png"
        ),
        Category(
            4,
            "Soups",
            "From classics to exotic: the world in one bowl",
            "soup.png"
        ),
        Category(
            5,
            "Salads",
            "Crunchy kaleidoscope under the sauce of inspiration",
            "salad.png"
        ),
    )

    private val burgerRecipes = listOf(
        Recipe(
            id = 0,
            title = "Classic Hamburger",
            ingredients = listOf(
                Ingredient("1", "pc", "Hamburger bun"),
                Ingredient("150", "g", "Ground beef"),
                Ingredient("0.5", "pc", "Onion"),
                Ingredient("1", "leaf", "Iceberg lettuce"),
                Ingredient("1", "slice", "Tomato"),
                Ingredient("1", "slice", "Cheddar cheese"),
                Ingredient("1", "tbsp", "Mayonnaise"),
                Ingredient("1", "tbsp", "Ketchup"),
                Ingredient("0.5", "tsp", "Mustard"),
                Ingredient("1", "pc", "Pickles"),
                Ingredient("1", "g", "Salt"),
                Ingredient("0.5", "g", "Black pepper")
            ),
            method = listOf(
                "Heat a skillet and cook the ground beef until done.",
                "Slice the onion and add it to the beef. Cook together until golden brown.",
                "Cut the bun into two parts and toast them until golden brown.",
                "Place a lettuce leaf, tomato slice, and cheese slice on the bottom bun.",
                "Add the beef with onions and pickles.",
                "Spread mayonnaise, ketchup, and mustard on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-hamburger.png"
        ),
        Recipe(
            id = 1,
            title = "Cheeseburger",
            ingredients = listOf(
                Ingredient("1", "pc", "Hamburger bun"),
                Ingredient("150", "g", "Ground beef"),
                Ingredient("0.5", "pc", "Onion"),
                Ingredient("1", "leaf", "Iceberg lettuce"),
                Ingredient("1", "slice", "Tomato"),
                Ingredient("1", "slice", "Cheddar cheese"),
                Ingredient("1", "tbsp", "Mayonnaise"),
                Ingredient("1", "tbsp", "Ketchup"),
                Ingredient("0.5", "tsp", "Mustard"),
                Ingredient("1", "pc", "Pickles"),
                Ingredient("1", "g", "Salt"),
                Ingredient("0.5", "g", "Black pepper")
            ),

            method = listOf(
                "Heat a skillet and cook the ground beef until done.",
                "Slice the onion into rings and add to the beef. Cook together until golden brown.",
                "Cut the bun in half and toast until golden brown.",
                "Place a leaf of lettuce, a slice of tomato, and cheese on the bottom bun.",
                "Add the beef with onions and pickles.",
                "Spread mayonnaise, ketchup, and mustard on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-cheeseburger.png"
        ),
        Recipe(
            id = 2,
            title = "Burger with Mushrooms and Cheese",
            ingredients = listOf(
                Ingredient("1", "pc.", "Hamburger bun"),
                Ingredient("150", "g", "Ground beef"),
                Ingredient("0.5", "pc.", "Onion"),
                Ingredient("1", "leaf", "Lettuce"),
                Ingredient("1", "slice", "Tomato"),
                Ingredient("2", "pc.", "Mushrooms, button"),
                Ingredient("1", "tbsp", "Mayonnaise"),
                Ingredient("1", "tbsp", "Ketchup"),
                Ingredient("0.5", "tsp", "Mustard"),
                Ingredient("1", "g", "Salt"),
                Ingredient("0.5", "g", "Black pepper, ground")
            ),
            method = listOf(
                "Heat a skillet and cook the ground beef until done.",
                "Slice the onion into rings and add to the beef. Cook together until golden brown.",
                "Slice the mushrooms and cook until golden brown.",
                "Cut the bun in half and toast until golden brown.",
                "Place a leaf of lettuce, a slice of tomato, and the beef on the bottom bun.",
                "Add the cooked mushrooms.",
                "Spread mayonnaise, ketchup, and mustard on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-mushrooms.png"
        ),
        Recipe(
            id = 3,
            title = "Burger with Chicken and Avocado",
            ingredients = listOf(
                Ingredient("1", "pc.", "Hamburger bun"),
                Ingredient("150", "g", "Chicken breast"),
                Ingredient("0.5", "pc.", "Onion"),
                Ingredient("1", "leaf", "Lettuce"),
                Ingredient("1", "slice", "Tomato"),
                Ingredient("0.5", "pc.", "Avocado"),
                Ingredient("1", "tbsp", "Mayonnaise"),
                Ingredient("1", "tbsp", "Ketchup"),
                Ingredient("0.5", "tsp", "Mustard"),
                Ingredient("1", "g", "Salt"),
                Ingredient("0.5", "g", "Black pepper, ground")
            ),
            method = listOf(
                "Cut the chicken breast into portion-sized pieces and cook until done.",
                "Slice the onion into rings and add to the chicken. Cook together until golden brown.",
                "Slice the avocado into slices.",
                "Cut the bun in half and toast until golden brown.",
                "Place a leaf of lettuce, a slice of tomato, and the chicken on the bottom bun.",
                "Add avocado slices.",
                "Spread mayonnaise, ketchup, and mustard on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-avocado.png"
        ),
        Recipe(
            id = 4,
            title = "Burger with Fish",
            ingredients = listOf(
                Ingredient("1", "pc.", "Hamburger bun"),
                Ingredient("150", "g", "Fish fillet (cod, salmon, etc.)"),
                Ingredient("0.5", "pc.", "Onion"),
                Ingredient("1", "leaf", "Lettuce"),
                Ingredient("1", "slice", "Tomato"),
                Ingredient("1", "tbsp", "Mayonnaise"),
                Ingredient("1", "tbsp", "Ketchup"),
                Ingredient("0.5", "tsp", "Mustard"),
                Ingredient("1", "g", "Salt"),
                Ingredient("0.5", "g", "Black pepper, ground")
            ),
            method = listOf(
                "Prepare the fish fillet according to your recipe (you can fry, bake, or steam it).",
                "Slice the onion into rings and add to the fish. Cook together until golden brown.",
                "Cut the bun in half and toast until golden brown.",
                "Place a leaf of lettuce, a slice of tomato, and the fish with onions on the bottom bun.",
                "Spread mayonnaise, ketchup, and mustard on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-fish.png"
        ),
        Recipe(
            id = 5,
            title = "Burger with Bacon",
            ingredients = listOf(
                Ingredient("1", "pc.", "Hamburger bun"),
                Ingredient("150", "g", "Ground beef"),
                Ingredient("0.5", "pc.", "Onion"),
                Ingredient("1", "leaf", "Lettuce"),
                Ingredient("1", "slice", "Tomato"),
                Ingredient("2", "slices", "Bacon"),
                Ingredient("1", "tbsp", "Mayonnaise"),
                Ingredient("1", "tbsp", "Ketchup"),
                Ingredient("0.5", "tsp", "Mustard"),
                Ingredient("1", "g", "Salt"),
                Ingredient("0.5", "g", "Black pepper, ground")
            ),
            method = listOf(
                "Heat a skillet and cook the ground beef until done.",
                "Slice the onion into rings and add to the beef. Cook together until golden brown.",
                "Cook the bacon until crispy.",
                "Cut the bun in half and toast until golden brown.",
                "Place a leaf of lettuce, a slice of tomato, and the beef on the bottom bun.",
                "Add bacon slices.",
                "Spread mayonnaise, ketchup, and mustard on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-bacon.png"
        ),
        Recipe(
            id = 6,
            title = "Vegan Burger",
            ingredients = listOf(
                Ingredient("1", "pc.", "Vegan hamburger bun"),
                Ingredient("150", "g", "Chickpea patty"),
                Ingredient("0.25", "pc.", "Red onion"),
                Ingredient("1", "tbsp", "Tomato sauce"),
                Ingredient("1", "tbsp", "Mustard"),
                Ingredient("0.5", "g", "Red cabbage"),
                Ingredient("0.5", "g", "Carrot"),
                Ingredient("0.5", "g", "Salt"),
                Ingredient("0.25", "g", "Black pepper"),
                Ingredient("0.25", "g", "Paprika"),
                Ingredient("0.25", "g", "Garlic powder")
            ),
            method = listOf(
                "Prepare the chickpea patty according to your recipe (you can use canned).",
                "Slice the onion and cabbage into rings, cut the carrot into thin strips.",
                "Toast the vegan bun.",
                "Place the chickpea patty on the bottom bun.",
                "Add onion, cabbage, and carrot.",
                "Spread tomato sauce and mustard on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-vegan.png"
        ),
        Recipe(
            id = 7,
            title = "Spicy Hamburger",
            ingredients = listOf(
                Ingredient("1", "pc.", "Hamburger bun"),
                Ingredient("150", "g", "Ground beef"),
                Ingredient("0.5", "pc.", "Onion"),
                Ingredient("1", "leaf", "Lettuce"),
                Ingredient("1", "slice", "Tomato"),
                Ingredient("1", "slice", "Cheddar cheese"),
                Ingredient("1", "tbsp", "Mayonnaise"),
                Ingredient("1", "tbsp", "Ketchup"),
                Ingredient("1", "tsp", "Tabasco sauce"),
                Ingredient("1", "g", "Salt"),
                Ingredient("0.5", "g", "Black pepper, ground")
            ),
            method = listOf(
                "Heat a skillet and cook the ground beef until done.",
                "Slice the onion into rings and add to the beef. Cook together until golden brown.",
                "Cut the bun in half and toast until golden brown.",
                "Place a leaf of lettuce, a slice of tomato, and cheese on the bottom bun.",
                "Add the beef with onions.",
                "Spread mayonnaise, ketchup, and Tabasco sauce on the top bun.",
                "Place the top bun over the other ingredients and serve."
            ),
            imageUrl = "burger-chili.png"
        )
    )

    fun getCategories() = categoriesList

    fun getRecipeById(recipeId: Int) = burgerRecipes.find { it.id == recipeId }
    fun getRecipesByCategoryId(categoryId: Int): List<Recipe> {
        return if (categoryId == 0) {
            burgerRecipes
        } else {
            emptyList()
        }
    }
}