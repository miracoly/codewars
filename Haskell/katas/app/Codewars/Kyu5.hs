module Codewars.Kyu5 where

import Data.Char
import Data.List

generateHashtag :: String -> Maybe String
generateHashtag str
  | dropWhile isSpace str == "" = Nothing
  | length hashtag > 140 = Nothing
  | otherwise = Just hashtag
    where hashtag = '#':(intercalate "" [(toUpper x):xs | x:xs <- (words str)])

rot13 :: String -> String
rot13 = map (\c -> chr $ add13 $ ord c)
  where
    add13 n
      | n `elem` [110..122] = (n + 13)
      | n `elem` [123..135] = (n + 13) - 25
      | otherwise = 110

--f xs = nub map [fan | (fan, _, score) <- xs, ]

--g = map (nub . map (\ (fan, _, _) -> fan)) . groupBy (\(_, _, x) (_, _, y) -> x == y)
