module Codewars.Kyu8 where

makeNegative :: (Num a, Ord a) => a -> a
makeNegative = negate . abs