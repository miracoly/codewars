module CIS194.Log.LogAnalysis where

import Data.String
import CIS194.Log.Log

parse :: String -> [LogMessage]
parse s = parseMessage <$> (lines s)

parseMessage :: String -> LogMessage
parseMessage m = let wl = words m in
  case wl of
    ("I":ts:mx) -> LogMessage Info (read ts) (unwords mx)
    ("W":ts:mx) -> LogMessage Warning (read ts) (unwords mx)
    ("E":sev:ts:mx) -> LogMessage (Error (read sev)) (read ts) (unwords mx)
    _ -> Unknown $ unwords wl