module CIS194.Week1 where

import Data.Char

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

