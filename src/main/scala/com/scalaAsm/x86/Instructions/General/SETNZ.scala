package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not zero/not equal (ZF=1)
// Category: general/datamov

trait SETNZ extends InstructionDefinition {
  val mnemonic = "SETNZ"
}

object SETNZ extends SETNZ with SETNZImpl

trait SETNZImpl {
  self: SETNZ =>
  implicit object SETNZ_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x95) /+ 0
  }
}
