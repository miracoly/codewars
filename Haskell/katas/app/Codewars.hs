module Codewars where

import Data.List

positiveSum :: [Int] -> Int
positiveSum xs = sum [x | x <- xs, x > 0]

stringEndsWith :: String -> String -> Bool
stringEndsWith s t = (ending s t) == t
  where
    ending :: String -> String -> String
    ending x y = reverse (take (length y)(reverse x))

descendingOrder :: Int -> Int
descendingOrder = read . reverse . sort . show
--descendingOrder = foldNumList . sortNumInList

toDigitList :: Int -> [Int]
toDigitList 0 = []
toDigitList x = toDigitList (x `div` 10) ++ [x `mod` 10]

sortNumInList :: Int -> [Int]
sortNumInList = reverse . sort . toDigitList

foldNumList :: [Int] -> Int
foldNumList = foldl addDigit 0
  where
    addDigit num d = 10 * num + d