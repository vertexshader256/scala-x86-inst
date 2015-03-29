package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/datamov

trait SETG extends InstructionDefinition {
  val mnemonic = "SETG"
}

object SETG extends SETG with SETGImpl

trait SETGImpl {
  self: SETG =>
  implicit object SETG_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9F) /+ 0
  }
}
