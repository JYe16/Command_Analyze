object CommandAnalyzer {

    case class GameObj(desc: String, kind: String)

    val grammar = List(
        "look",
        "inventory",
        "go {direction}",
        "climb {object}",
        "take {object}",
        "drop {object}",
        "examine {object}",
        "search {object}",
        "sit on {object}",
        "lie on {object}",
        "open {container}",
        "close {container}",
        "lock {container}",
        "unlock {container}",
        "put {item} in {container}",
        "put {item} on {supporter}",
        "wear {clothing}",
        "take off {clothing}",
        "tie {item} to {object}",
        "talk to {person}")

    val world = List(
        GameObj("north", "direction"),
        GameObj("south", "direction"),
        GameObj("east", "direction"),
        GameObj("west", "direction"),
        GameObj("comfy chair", "object"),
        GameObj("shabby twin bed", "object"),
        GameObj("elegant carpet", "object"),
        GameObj("soccer ball", "item"),
        GameObj("beach ball", "item"),
        GameObj("small green frog", "item"),
        GameObj("small tree frog", "item"),
        GameObj("large wooden box", "container"),
        GameObj("flimsy cardboard box", "container"),
        GameObj("solid wooden table", "supporter"),
        GameObj("glass side stand", "supporter"),
        GameObj("purple hoodie", "clothing"),
        GameObj("leather jacket", "clothing"),
        GameObj("very old man", "person"),
        GameObj("very young woman", "person"))
    
    // ==========================================================
    // helper functions
    // ==========================================================
      
    // turn a string of words separated by spaces into a list of those words
    def getWordList(words: String): List[String] =
      
    
    // ==========================================================
    // functions on world
    // ==========================================================
    
    // Note: All lists of string that are returned from the following methods should be
    // distinct (no duplicates) and they should be in sorted order.
    
    // returns a list of all the adjectives (all but last words in desc) in world
    // example: cardboard, flimsy, very [ but not 'box' ]
    def getAdjectives(): List[String] =
      
    
    // returns a list of nouns (last words in desc) from world
    // example: box, frog, man
    def getNouns(): List[String] =
      
    
    // returns a list of game-object kinds from world
    // example: direction, item, object
    def getGameObjectKinds(): List[String] =
      
    
    // returns a list of game-objects associated with a particular noun
    // example: getGameObjects("frog") => 
    //   List(GameObj("small green frog", "item"), GameObj("small tree frog", "item"))
    def getGameObjects(noun: String) =
      

    // ==========================================================
    // functions on grammar
    // ==========================================================
    
    // Note: All lists of string that are returned from the following methods should be
    // distinct (no duplicates) and they should be in sorted order.  
    
    // returns a list of all verbs (first words) in grammar
    // example: look, examine, put
    def getVerbs(): List[String] =
      
    
    // returns a list of all prepositions in grammar
    // prepositions are words in grammar strings that are not verbs and not
    // in curly braces
    // example: in, on, to
    def getPrepositions(): List[String] =
      
    
    // returns a list of all actions from grammar
    // actions are formed by combining the verb with its preposition (if any) with
    // an underscore between them
    // example: look, examine, put_in
    def getActions(): List[String] =
      
    
    // returns a list of game-object kinds from grammar
    // kinds are all the words in curly braces
    // example: direction, item, object
    def getGrammarObjectKinds(): List[String] =
      
    
    // given a verb, returns a list of all grammar strings associated with it
    // example: put => List(put {item} in {object}, put {item} on {object})
    def getGrammarStrings(verb: String): List[String] =
      
    
    // ==========================================================
    // getVocab function
    // ==========================================================
    
    // returns a list of all known words (from grammar and world)
    // note: does not include words in curly braces: {object} {direction} etc.
    def getVocab(): List[String] =
      
    
    // ==========================================================
    // command related functions
    // ==========================================================
    
    // return true if the words contain a preposition
    def hasPrep(words: String): Boolean =
      
      
    // return true if the words match the specified game object
    // for a string of words to match a game object, all the words in the string
    // must be words contained in the description of the game object
    // example: wordsMatchGameObj("tree tree", GameObj("small tree frog", "item") ==> true
    // example: wordsMatchGameObj("small ball", GameObj("beach ball", "item") ==> false
    def wordsMatchGameObj(words: String, gameObj: GameObj): Boolean =
      
    
    // return true if the words match the specified pattern
    // for a command string to match a pattern, the verb and prepositions
    // must match exactly and there must be one or more words for each bracket-word
    // example: wordsMatchPattern("put in box", "put {item} in {container}") ==> false
    // example: wordsMatchPattern("put ball tree tree in wooden flimsy",
    // "put {item} in {container}") ==> true  
    def wordsMatchPattern(cmdWords: String, pattern: String): Boolean = 
      
}