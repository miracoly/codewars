module Codewars.Kyu8 where

makeNegative :: (Num a, Ord a) => a -> a
makeNegative = negate . abs

boolToWord :: Bool -> String
boolToWord True = "Yes"
boolToWord _ = "No"

repeatStr :: Int -> String -> String
repeatStr n str = concat $ replicate n str

numberToString :: Int -> String
numberToString = show