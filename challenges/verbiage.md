# Intervening Verbiage

Given two words in a string of words, count the number of other words between the two words you are given.

## Business Rules/Errata

- Your solution will take in three pieces of input: a string containing a space-separated list of words, and two other strings representing the first and second words, respectively.
- You may ignore all punctuation and capitalization.
- If your two words are not in the string of words, alert the user to an error.
- You should return a count of the words between your two words as an integer, not the words themselves.
- If your words appear multiple times in the list of words, count words that fall between the first instance of each.

## Examples

```
list_of_words = "There was an old lady who lived in an outhouse";
count_words_between("lady", "outhouse", list_of_words)  // 4 
count_words_between("an", "outhouse", list_of_words)    // 6
```

- The words 'who', 'lived', 'in', 'an' appear between 'lady' and 'outhouse'.
- The words 'old', 'lady', 'who', 'lived', 'in', 'an' appear between the first instance of 'an' and 'outhouse'.

## Tackling This Challenge

1. Checkout a new branch using `git checkout -b yourgithubusername-wip`.
1. Add your code to the 'mob.java' file to make the `countWordsBetween` function work as expected.

## Requirements

- JDK 11+
