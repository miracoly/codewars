module CIS194.Week1 where

import Data.Char

validate :: Int -> Bool
validate n = 0 == mod (sum n) 10
  where sum = sumDigits . doubleEveryOther . toDigits

sumDigits :: [Int] -> Int
sumDigits = sum . map (sum . map digitToInt . show)

doubleEveryOther :: [Int] -> [Int]
doubleEveryOther = reverse . double . reverse
  where
    double (x:y:xs) = x:(2*y):(double xs)
    double x = x

toDigitsRev :: Int -> [Int]
toDigitsRev = reverse . toDigits

toDigits :: Int -> [Int]
toDigits n
  | n <= 0 = []
  | otherwise =  map digitToInt (show n)

