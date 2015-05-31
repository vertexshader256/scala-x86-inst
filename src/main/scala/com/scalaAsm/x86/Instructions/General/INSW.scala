package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Input from Port to String
// Category: general/inoutstring

trait INSW extends InstructionDefinition {
  val mnemonic = "INSW"
}

object INSW extends ZeroOperands[INSW] with INSWImpl

trait INSWImpl extends INSW {
  implicit object INSW_0 extends _0 {
    val opcode: OneOpcode = 0x6D
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
